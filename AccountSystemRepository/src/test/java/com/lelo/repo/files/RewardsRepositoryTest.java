package com.lelo.repo.files;

import com.lelo.test.config.TestRepository;
import com.lelo.webdomain.persistence.Rewards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.test.context.ContextConfiguration;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = {TestRepository.class})
class RewardsRepositoryTest {

    @Autowired private RewardsRepository repository;

    @BeforeEach
    void setUp() {
        repository.save(new Rewards(
                null,
                "Technology",
                "Caynon Mouse",
                "150"
        ));
    }

    @Test
    @Transactional
    @Modifying
    void updateRewardsPriceById() {
        Rewards one = repository.getOne(Long.parseLong(String.valueOf(1)));
        one.setAmount("170");
        repository.save(one);

        assertEquals("170",repository.getOne(Long.parseLong(String.valueOf(1))).getAmount());
    }
}