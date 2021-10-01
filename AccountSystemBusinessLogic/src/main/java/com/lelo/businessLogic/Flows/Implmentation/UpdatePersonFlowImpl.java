package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePersonFlowImpl implements UpdatePersonFlow {
    private final PersonTranslator personTranslator;

    @Autowired
    public UpdatePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO updatePerson(Long id) {
        PersonDTO personDTO = personTranslator.updatePerson(id);
        return personDTO;
    }
}
