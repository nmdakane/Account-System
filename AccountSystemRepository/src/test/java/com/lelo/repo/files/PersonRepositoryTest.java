package com.lelo.repo.files;

import com.lelo.test.config.TestRepository;
import com.lelo.webdomain.persistence.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = {TestRepository.class})
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        personRepository.save(new Person(
                null,
                "Lelo",
                "Mdikani",
                "0839754108",
                "mpumi@gmail.com",
                0,
                0.0
        ));
    }

    @Test
    void getPerson() {
        assertNotNull(personRepository.getPerson("mpumi@gmail.com"));
    }

    @Test
    void getPlays() {
        assertEquals(0,personRepository.getPlays("mpumi@gmail.com"));
    }

    @Test
    void getCurrentAmount() {
        assertEquals(0,personRepository.getCurrentAmount("mpumi@gmail.com"));
    }

    @Test
    void updatePlaysByEmail() {
        personRepository.updatePlaysByEmail("mpumi@gmail.com",2);
        assertEquals(2,personRepository.getPlays("mpumi@gmail.com"));
    }

    @Test
    void updatePhoneByEmail() {
        personRepository.updatePhoneByEmail("mpumi@gmail.com","0786541025");
        assertEquals("0786541025",personRepository.getPerson("mpumi@gmail.com").getPhoneNumber());
    }

    @Test
    void updateAmountByEmail() {
        personRepository.updateAmountByEmail("mpumi@gmail.com",241);
        assertEquals(241,personRepository.getCurrentAmount("mpumi@gmail.com"));
    }
}