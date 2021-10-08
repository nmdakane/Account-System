package com.lelo.translator;

import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface PersonTranslator {
    List<com.lelo.webdomain.dtos.PersonDTO> getPeople();
    com.lelo.webdomain.dtos.PersonDTO getPersonInfo(String email);
    com.lelo.webdomain.dtos.PersonDTO updatePersonPhone(String email, String phoneNumber);
    com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person);
    void deletePerson(String email);
    void updateGamePlays(String email);
    void updateAmount(String email, TransactionsDTO transactionsDTO);

}
