package com.lelo.translator;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface TransactionsTranslator {
    List<TransactionsDTO> getAllTransactions();
    List<TransactionsDTO> getTransactionsOfPerson(Person id);
    TransactionsDTO createTransaction(TransactionsDTO transactions);

}
