package com.lelo.translator.Implementation;

import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.webdomain.dtos.TransactionsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TransactionsTransImplTest {

    @Mock private TransactionsRepository transactionsRepository;
    @Mock private AccountTypeRepository accountTypeRepository;
    @Mock private PersonRepository personRepositoryl;

    private TransactionsTransImpl transactionsTrans;

    @BeforeEach
    void setUp() {
        transactionsTrans = new TransactionsTransImpl(transactionsRepository,accountTypeRepository,personRepositoryl);
    }

    @Test
    void getAllTransactions() {
        transactionsTrans.getAllTransactions();
        verify(transactionsRepository).findAll();
    }

    @Test
    void getTransactionsOfPerson() {
        transactionsTrans.getTransactionsOfPerson("mpumi@gmail.com");
        verify(transactionsRepository).getPersonTranctions("mpumi@gmail.com");
    }
/*
    @Test
    void createTransaction() {
        TransactionsDTO transactionsDTO = new TransactionsDTO(
                "coffee",
                150,
                "rewards",
                "Miles",
                "mpumi@gmail.com"
        );
        transactionsTrans.createTransaction();
        verify(transactionsRepository).save()
    }*/

    @Test
    void deleteTransactionsByEmail() {
    }
}