package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;

public interface CreatePersonFlow {
    com.lelo.webdomain.dtos.PersonDTO addPerson(PersonDTO person);
}
