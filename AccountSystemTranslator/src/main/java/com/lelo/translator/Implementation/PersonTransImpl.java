package com.lelo.translator.Implementation;

import com.lelo.repo.files.PersonRepository;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonTransImpl implements PersonTranslator {
    private final PersonRepository repository;

    @Autowired
    public PersonTransImpl(PersonRepository rep) {
        this.repository = rep;
    }

    @Override
    public List<com.lelo.webdomain.dtos.PersonDTO> getPeople() {
        List<com.lelo.webdomain.dtos.PersonDTO> personDTODTOS = new ArrayList<>();
        try {
            for(Person person : repository.findAll()){
                personDTODTOS.add(new com.lelo.webdomain.dtos.PersonDTO(person));
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get a list of members from the db",e);
        }
        return personDTODTOS;
    }

    @Override
    public com.lelo.webdomain.dtos.PersonDTO getPerson(Long id) {
        Person person;
        try {
            person = repository.getOne(id);
        }catch(Exception e){
            throw new RuntimeException("Cannot get a member with id "+ id +" members from the db",e);
        }
        return new com.lelo.webdomain.dtos.PersonDTO(person);
    }

    @Override
    public com.lelo.webdomain.dtos.PersonDTO updatePerson(Long id) {
        Person person = repository.getOne(id);
        try {
            repository.save(person);
        }catch(Exception e){
            throw new RuntimeException("Cannot get a member with id "+ id +" members from the db",e);
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
            member.setPlays(person.getPlays());
            member.setGoals(null);
            member.setTransactions(null);
            repository.save(member);
        }catch(Exception e){
            throw new RuntimeException("Cannot add a members into the db",e);
        }
        return new com.lelo.webdomain.dtos.PersonDTO(member);
    }

    @Override
    public void deletePerson(Long id) {
        try {
            repository.deleteById(id);
        }catch(Exception e){
            throw new RuntimeException("Cannot delete members from the db",e);
        }
    }
}

