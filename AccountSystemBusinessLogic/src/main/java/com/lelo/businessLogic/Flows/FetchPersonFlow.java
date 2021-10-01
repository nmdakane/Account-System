package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.PersonDTO;

public interface FetchPersonFlow {
    PersonDTO getPerson(Long id);
}
