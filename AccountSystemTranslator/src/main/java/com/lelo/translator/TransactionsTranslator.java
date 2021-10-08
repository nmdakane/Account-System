package com.lelo.translator;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface TransactionsTranslator {
    List<TransactionsDTO> getAllTransactions();
    List<TransactionsDTO> getTransactionsOfPerson(String email);
    TransactionsDTO createTransaction(TransactionsDTO transactions);
    //void createDefaultTransaction(String accountType, String email);
    void deleteTransactionsByEmail(String email);
}
