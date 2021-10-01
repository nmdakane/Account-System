package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPeopleFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchPeopleFlowImpl implements FetchPeopleFlow {
    private final PersonTranslator personTranslator;

    @Autowired
    public FetchPeopleFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public List<PersonDTO> getPeople() {
        List<PersonDTO> personDTOS = personTranslator.getPeople();
        return personDTOS;
    }
}
