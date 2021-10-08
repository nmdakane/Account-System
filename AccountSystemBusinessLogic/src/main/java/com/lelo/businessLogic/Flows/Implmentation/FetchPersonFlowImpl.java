package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchPersonFlowImpl implements FetchPersonFlow {
    private final PersonTranslator personTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchPeopleFlowImpl.class);

    @Autowired
    public FetchPersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO getPerson(String email) {
        PersonDTO personDTO = personTranslator.getPersonInfo(email);

        LOGGER.info("Person with id {} is {}", email, personDTO);
        return personDTO;
    }
}
