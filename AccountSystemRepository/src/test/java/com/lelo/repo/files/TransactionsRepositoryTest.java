package com.lelo.repo.files;

import com.lelo.test.config.TestRepository;
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = {TestRepository.class})
class TransactionsRepositoryTest {

    @Autowired private TransactionsRepository transactionsRepository;
    @Autowired private TestEntityManager testEntityManagerAT;
    @Autowired private TestEntityManager testEntityManagerPS;

    @BeforeEach
    void setUp() {
         AccountType ac = testEntityManagerAT.persist(new AccountType(null,
                "MILES",
                LocalDate.now(),
                "miles account"
                ));

         Person person = testEntityManagerPS.persist(new Person(
                null,
                "Lelo",
                "Mdikani",
                "0839754108",
                "mpumi@gmail.com",
                0,
                0.0
        ));

        transactionsRepository.save(new PersonTransactions(
                null,
                "coffee",
                "rewards",
                ac,
                person,
                75
        ));
    }

    @Test
    void getPersonTranctions() {
        assertNotNull(transactionsRepository.getPersonTranctions("mpumi@gmail.com"));
    }

    @Test
    void deletePersonTransactionsByEmail() {
        transactionsRepository.deletePersonTransactionsByEmail("mpumi@gmail.com");
        assertThat(transactionsRepository.getPersonTranctions("mpumi@gmail.com").size()).isEqualTo(0);
    }
}