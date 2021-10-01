package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;

public interface UpdatePersonFlow {
    PersonDTO updatePerson(Long id);
}
