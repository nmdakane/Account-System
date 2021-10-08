package com.lelo.translator.Implementation;

import com.lelo.repo.files.GoalsRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Goals;
import com.lelo.webdomain.persistence.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GoalsTransImplTest {

    @Mock private GoalsRepository goalsRepository;
    @Mock private PersonRepository personRepository;

    private GoalsTransImpl goalsTrans;

    @BeforeEach
    void setUp() {
        goalsTrans = new GoalsTransImpl(goalsRepository,personRepository);
    }

    @Test
    void getGoalsPerson() {
        goalsTrans.getGoalsPerson();
        verify(goalsRepository).findAll();
    }

    @Test
    void getPersonGoals() {
        goalsTrans.getPersonGoals("mpumi@gmail.com");
        verify(goalsRepository).getGoalsByMemberEmail("mpumi@gmail.com");
    }

    @Test
    void goalsUpdateDriving() {
        goalsTrans.goalsUpdateDriving("mpumi@gmail.com",60);
        verify(goalsRepository).updateGoalsDrivingByMemberId("mpumi@gmail.com",60);
    }

    @Test
    void goalsUpdateSpending() {
        goalsTrans.goalsUpdateSpending("mpumi@gmail.com",60);
        verify(goalsRepository).updateGoalsSpendingByMemberId("mpumi@gmail.com",60);
    }

    @Test
    void goalsUpdateHealthFitness() {
        goalsTrans.goalsUpdateHealthFitness("mpumi@gmail.com",60);
        verify(goalsRepository).updateGoalsSHealthFitnessByMemberId("mpumi@gmail.com",60);
    }

    @Test
    void deleteGoals() {
        goalsTrans.deleteGoals("mpumi@gmail.com");
        Goals goals= goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com");
        verify(goalsRepository).deleteByMemberId(goals.getMemberEmail().getEmail());
    }

    @Test
    void addGoals() {
        PersonDTO personDTO = new PersonDTO(
                "lelo",
                "mdikani",
                "0839754108",
                "mpumi@gmail.com",
                0,
                0,
                new GoalsDTO("15","20","67"));

        GoalsDTO goalsDTO =  goalsTrans.addGoals(personDTO);
        Person person = personRepository.getPerson(personDTO.getEmail());
        //verify(personRepository).getPerson(personDTO.getEmail());
        Goals goals = goalsDTO.buildGoals(person);
        verify(goalsRepository).save(goalsDTO.buildGoals(person));
    }
}