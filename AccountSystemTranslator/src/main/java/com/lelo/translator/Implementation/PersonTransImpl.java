package com.lelo.translator.Implementation;

import com.lelo.repo.files.GoalsRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Goals;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonTransImpl implements PersonTranslator {
    private final PersonRepository repository;
    private final GoalsRepository goalsRepository;
    private  final TransactionsRepository transactionsRepository;


    @Autowired
    public PersonTransImpl(PersonRepository repository, GoalsRepository goalsRepository, TransactionsRepository transactionsRepository) {
        this.repository = repository;
        this.goalsRepository = goalsRepository;
        this.transactionsRepository = transactionsRepository;
    }


    @Override
    public List<com.lelo.webdomain.dtos.PersonDTO> getPeople() {
        List<com.lelo.webdomain.dtos.PersonDTO> personDTODTOS = new ArrayList<>();
        try {
            for(Person person : repository.findAll()){
                updateGamePlays(person.getEmail());
                personDTODTOS.add(new com.lelo.webdomain.dtos.PersonDTO(person));
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get a list of members from the db",e);
        }
        return personDTODTOS;
    }

    @Override
    public com.lelo.webdomain.dtos.PersonDTO getPersonInfo(String email) {
        Person person;
        updateGamePlays(email);
        try {
            person = repository.getPerson(email);
        }catch(Exception e){
            throw new RuntimeException("Cannot get a member with email "+ email +" members from the db",e);
        }
        return new com.lelo.webdomain.dtos.PersonDTO(person);
    }

    @Override
    public com.lelo.webdomain.dtos.PersonDTO updatePersonPhone(String email, String phone) {
        Person person;
        try {
            repository.updatePhoneByEmail(email,phone);
            person = repository.getPerson(email);
        }catch(Exception e){
            throw new RuntimeException("Cannot get a member with id "+ email +" members from the db",e);
        }
        return new com.lelo.webdomain.dtos.PersonDTO(person);
    }

    @Override
    public com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person) {
        Person member = new Person();
        try {
            member.setId(null);
            member.setName(person.getName());
            member.setSurname(person.getSurname());
            member.setEmail(person.getEmail());
            member.setPhoneNumber(person.getPhoneNumber());
            member.setPlays(person.getGame_plays());
            repository.save(member);
        }catch(Exception e){
            throw new RuntimeException("Cannot add a members into the db",e);
        }
        return new com.lelo.webdomain.dtos.PersonDTO(member);
    }

    @Override
    public void deletePerson(String email) {
        Person person = repository.getPerson(email);
        try {
            repository.delete(person);

        }catch(Exception e){
            throw new RuntimeException("Cannot delete members from the db",e);
        }
    }

    @Override
    public void updateAmount(String email, TransactionsDTO transactionsDTO) {
        try {
            double amount = repository.getCurrentAmount(email);

            if(transactionsDTO.getType().equalsIgnoreCase("REWARDS")){
                double new_amount = amount-transactionsDTO.getAmount();
                repository.updateAmountByEmail(email,new_amount);
            }else if(transactionsDTO.getType().equalsIgnoreCase("GAMEPLAY")){
                double new_amount = amount+transactionsDTO.getAmount();
                repository.updateAmountByEmail(email,new_amount);
            }

        }catch (Exception e){
            throw new RuntimeException("Cannot update person cur amount to the db",e);
        }
    }

    @Override
    public void updateGamePlays(String email) {
        final double DRIVINGGOAL = 60;
        final double SPENDINGGOAL = 2000;
        final double HEALTHFITNESSGOAL = 250;

        try {
           int plays = repository.getPlays(email);
           Goals goals = goalsRepository.getGoalsByMemberEmail(email);

           if(goals.getDriving().equals(String.valueOf(DRIVINGGOAL))){
               plays++;
           }else if(goals.getHealthandfitness().equals(String.valueOf(HEALTHFITNESSGOAL))){
               plays++;
           }else if(goals.getSpending().equals(String.valueOf(SPENDINGGOAL))){
               plays++;
           }

           repository.updatePlaysByEmail(email,plays);
        }catch (Exception e){
            throw new RuntimeException("Cannot update game plays to the db",e);
        }
    }
}

