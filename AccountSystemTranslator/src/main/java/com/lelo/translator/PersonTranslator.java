package com.lelo.translator;

import com.lelo.webdomain.dtos.PersonDTO;
<<<<<<< HEAD
import com.lelo.webdomain.dtos.TransactionsDTO;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface PersonTranslator {
    List<com.lelo.webdomain.dtos.PersonDTO> getPeople();
<<<<<<< HEAD
    com.lelo.webdomain.dtos.PersonDTO getPersonInfo(String email);
    com.lelo.webdomain.dtos.PersonDTO updatePersonPhone(String email, String phoneNumber);
    com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person);
    void deletePerson(String email);
    void updateGamePlays(String email);
    void updateAmount(String email, TransactionsDTO transactionsDTO);
=======
    com.lelo.webdomain.dtos.PersonDTO getPerson(Long id);
    com.lelo.webdomain.dtos.PersonDTO updatePerson(Long id);
    com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person);
    void deletePerson(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

}
