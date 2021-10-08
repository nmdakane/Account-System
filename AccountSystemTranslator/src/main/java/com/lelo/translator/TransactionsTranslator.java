package com.lelo.translator;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface TransactionsTranslator {
    List<TransactionsDTO> getAllTransactions();
<<<<<<< HEAD
    List<TransactionsDTO> getTransactionsOfPerson(String email);
    TransactionsDTO createTransaction(TransactionsDTO transactions);
    //void createDefaultTransaction(String accountType, String email);
    void deleteTransactionsByEmail(String email);
=======
    List<TransactionsDTO> getTransactionsOfPerson(Person id);
    TransactionsDTO createTransaction(TransactionsDTO transactions);

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
