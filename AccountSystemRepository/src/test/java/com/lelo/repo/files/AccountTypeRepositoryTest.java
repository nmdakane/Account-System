package com.lelo.repo.files;

import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.test.config.TestRepository;
import com.lelo.webdomain.persistence.AccountType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {TestRepository.class})
class AccountTypeRepositoryTest {

    @Autowired
     AccountTypeRepository test;

    @BeforeEach
    void setUp() {
        AccountType accountType = test.save(new AccountType(
                null,
                "DOLLARS",
                LocalDate.now(),
                "dollars account"
        ));
    }

    @Test
    void getAccountTypeByNmonic() {
        assertNotNull(test.getAccountTypeByNmonic("DOLLARS"));
    }
}