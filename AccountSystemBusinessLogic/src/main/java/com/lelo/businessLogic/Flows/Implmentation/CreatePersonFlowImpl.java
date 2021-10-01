package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreatePersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonFlowImpl implements CreatePersonFlow {
    private final PersonTranslator personTranslator;

    @Autowired
    public CreatePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO addPerson(PersonDTO person) {
        PersonDTO personDTO = personTranslator.addPerson(person);
        return personDTO;
    }
}
