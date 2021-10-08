package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.List;

public interface FetchTransactionsForPersonFlow {
<<<<<<< HEAD
    List<TransactionsDTO> getTransactionsOfPerson(String email);
=======
    List<TransactionsDTO> getTransactionsOfPerson(Person id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
