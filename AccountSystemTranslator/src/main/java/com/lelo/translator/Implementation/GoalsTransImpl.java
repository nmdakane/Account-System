package com.lelo.translator.Implementation;

import com.lelo.repo.files.GoalsRepository;
<<<<<<< HEAD
import com.lelo.repo.files.PersonRepository;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Goals;
import com.lelo.webdomain.persistence.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.persistence.Goals;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GoalsTransImpl implements GoalsTranslator {
    private final GoalsRepository goalsRepository;
<<<<<<< HEAD
    private final PersonRepository personRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(GoalsTransImpl.class);

    @Autowired
    public GoalsTransImpl(GoalsRepository goalsRepository, PersonRepository personRepository) {
        this.goalsRepository = goalsRepository;
        this.personRepository = personRepository;
    }


    @Override
    public List<GoalsDTO> getGoalsPerson() {
=======

    @Autowired
    public GoalsTransImpl(GoalsRepository goalsRepository) {
        this.goalsRepository = goalsRepository;
    }

    @Override
    public List<GoalsDTO> getGoals() {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        List<GoalsDTO> goalsDTOS = new ArrayList<>();
        try {
            for(Goals goals:goalsRepository.findAll()){
                goalsDTOS.add(new GoalsDTO(goals));
            }
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return goalsDTOS;
    }

    @Override
<<<<<<< HEAD
    public GoalsDTO getPersonGoals(String email) {
        Goals goals;
        try {
            goals = goalsRepository.getGoalsByMemberEmail(email);
=======
    public GoalsDTO getPersonGoals(Long id) {
        Goals goals;
        try {
            goals = goalsRepository.getOne(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return new GoalsDTO(goals);
    }

    @Override
<<<<<<< HEAD
    public void goalsUpdateDriving(String email, double goal) {
        try {
            goalsRepository.updateGoalsDrivingByMemberId(email,goal);
        }catch (Exception e){
            throw new RuntimeException("Cannot get update driving goal to the db",e);
        }
    }

    @Override
    public void goalsUpdateSpending(String email, double goal) {
        try {
            goalsRepository.updateGoalsSpendingByMemberId(email,goal);
        }catch (Exception e){
            throw new RuntimeException("Cannot get update spending goal to the db",e);
        }
    }

    @Override
    public void goalsUpdateHealthFitness(String email, double goal) {
        try {
            goalsRepository.updateGoalsSHealthFitnessByMemberId(email,goal);
        }catch (Exception e){
            throw new RuntimeException("Cannot get health and fitness goal to the db",e);
        }
    }

    @Override
    public void deleteGoals(String email) {
        Goals goals = goalsRepository.getGoalsByMemberEmail(email);
        try {
            goalsRepository.deleteById(goals.getId());
        }catch (Exception e){
            throw new RuntimeException("Cannot delete person's goals from the db by id",e);
        }
    }

    @Override
    public GoalsDTO addGoals(PersonDTO personDTO) {
        Goals goals;
        GoalsDTO goalsDTO = personDTO.getGoalsDTO();
        LOGGER.info("Goalsdto created is {}", goalsDTO);
        try {
            Person person = personRepository.getPerson(personDTO.getEmail());
            LOGGER.info("Person created is {}", person);
            goals = goalsDTO.buildGoals(person);
            LOGGER.info("Goals created is {}", goals);
            goalsRepository.save(goals);
        }catch (Exception e){
            throw new RuntimeException("Cannot get add new goals to the db",e);
        }
        return new GoalsDTO(goals);
    }


=======
    public GoalsDTO goalsUpdate(Long id) {
        Goals goals = goalsRepository.getOne(id);
        try {
            goalsRepository.save(goals);
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return new GoalsDTO(goals);
    }

    @Override
    public void deleteGoals(Long id) {
        try {
            goalsRepository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Cannot delete person's goals from the db",e);
        }
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
