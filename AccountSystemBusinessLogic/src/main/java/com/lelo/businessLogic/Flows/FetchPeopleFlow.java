package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;

import java.util.List;

public interface FetchPeopleFlow {
    List<PersonDTO> getPeople();
}
