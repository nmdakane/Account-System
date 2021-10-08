package com.lelo.repo.files;

import com.lelo.test.config.TestRepository;
import com.lelo.webdomain.persistence.Goals;
import com.lelo.webdomain.persistence.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {TestRepository.class})
class GoalsRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private GoalsRepository goalsRepository;

    @BeforeEach
    void setUp() {
        Person persist = testEntityManager.persist(new Person(null,
                "Lelo",
                "Mdikani",
                "0839754108",
                "mpumi@gmail.com",
                0,
                0.0
                ));
        Goals goals = new Goals(
                null,
                persist,
                "20",
                "30",
                "500"
        );

        goalsRepository.save(goals);
    }

    @Test
    void updateGoalsDrivingByMemberIdTest() {
        Goals goalsByMemberEmail = goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com");
        goalsByMemberEmail.setDriving("30");

        goalsRepository.save(goalsByMemberEmail);
        //goalsRepository.updateGoalsDrivingByMemberId("mpumi@gmail.com",30);
        assertEquals("30",goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com").getDriving());
    }

    @Test
    void updateGoalsSpendingByMemberIdTest() {
        Goals goal = goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com");
        goal.setSpending("1000");

        goalsRepository.save(goal);
        goalsRepository.updateGoalsSpendingByMemberId("mpumi@gmail.com",1000);
        assertEquals("1000",goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com").getSpending());
    }

    @Test
    void updateGoalsSHealthFitnessByMemberIdTest() {
        Goals goal = goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com");
        goal.setHealthandfitness("356");

        goalsRepository.updateGoalsSHealthFitnessByMemberId("mpumi@gmail.com",356);
        assertEquals("356",goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com").getHealthandfitness());
    }

    @Test
    void getGoalsByMemberEmail() {
        assertNotNull(goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com"));
    }

    @Test
    void deleteByMemberId() {
        goalsRepository.deleteByMemberId("mpumi@gmail.com");
        assertNull(goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com"));
    }
}