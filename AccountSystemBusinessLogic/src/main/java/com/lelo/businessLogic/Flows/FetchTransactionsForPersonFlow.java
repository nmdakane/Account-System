package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.List;

public interface FetchTransactionsForPersonFlow {
    List<TransactionsDTO> getTransactionsOfPerson(Person id);
}
