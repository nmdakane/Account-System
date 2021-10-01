package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchPersonFlowImpl implements FetchPersonFlow {
    private final PersonTranslator personTranslator;

    @Autowired
    public FetchPersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO getPerson(Long id) {
        PersonDTO personDTO = personTranslator.getPerson(id);
        return personDTO;
    }
}
