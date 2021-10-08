package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;
<<<<<<< HEAD
import com.lelo.webdomain.dtos.TransactionsDTO;

public interface UpdatePersonFlow {
    PersonDTO updatePerson(String email, String phon);
    void updateAmount(String email, TransactionsDTO transactionsDTO);
=======

public interface UpdatePersonFlow {
    PersonDTO updatePerson(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
