package com.lelo.translator.Implementation;

import com.lelo.repo.files.GoalsRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Goals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonTransImplTest {

    @Mock private PersonRepository personRepository;
    @Mock private TransactionsRepository transactionsRepository;
    @Mock private GoalsRepository goalsRepository;

    private PersonTransImpl personTrans;

    @BeforeEach
    void setUp() {
        personTrans = new PersonTransImpl(personRepository,goalsRepository,transactionsRepository);
    }

    @Test
    void getPeople() {
        personTrans.getPeople();
        verify(personRepository).findAll();
    }

    @Test
    void getPersonInfo() {
        personTrans.getPersonInfo("mpumi@gmail.com");
        verify(personRepository.getPerson("mpumi@gmail.com"));
    }

    @Test
    void updatePersonPhone() {
        addPerson();
        personTrans.updatePersonPhone("mpumi@gmail.com","07841055698");
        verify(personRepository).updatePhoneByEmail("mpumi@gmail.com","07841055698");
    }

    @Test
    void addPerson() {
        PersonDTO personDTO = new PersonDTO(
                "lelo",
                "mdikani",
                "0839754108",
                "mpumi@gmail.com",
                0,
                0,
                new GoalsDTO("2000","20","67"));
        personTrans.addPerson(personDTO);
        verify(personRepository).save(personDTO.buildPerson(personDTO));
    }

    @Test
    void deletePerson() {
        personTrans.deletePerson("mpumi@gmail.com");
        verify(personRepository).getPerson("mpumi@gmail.com");
        //verify(personRepository).
    }

    @Test
    void updateAmount() {
        personTrans.updateAmount("mpumi@gmail.com",new TransactionsDTO(
                "coffee",
                75,
                "Miles",
                "mpumi@gmail.com",
                "rewards"
        ));
        verify(personRepository).updateAmountByEmail("mpumi@gmail.com",500);
    }

    @Test
    void updateGamePlays() {
        addPerson();
        Goals goals =goalsRepository.getGoalsByMemberEmail("mpumi@gmail.com");
        personTrans.updateGamePlays(goals.getMemberEmail().getEmail());
        verify(personRepository).updatePlaysByEmail("mpumi@gmail.com",3);
    }
}