package com.lelo.translator;

import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;

import java.util.*;

public interface PersonTranslator {
    List<com.lelo.webdomain.dtos.PersonDTO> getPeople();
    com.lelo.webdomain.dtos.PersonDTO getPerson(Long id);
    com.lelo.webdomain.dtos.PersonDTO updatePerson(Long id);
    com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person);
    void deletePerson(Long id);

}
