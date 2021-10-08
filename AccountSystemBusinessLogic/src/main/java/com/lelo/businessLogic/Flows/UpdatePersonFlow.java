package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;

public interface UpdatePersonFlow {
    PersonDTO updatePerson(String email, String phon);
    void updateAmount(String email, TransactionsDTO transactionsDTO);
}
