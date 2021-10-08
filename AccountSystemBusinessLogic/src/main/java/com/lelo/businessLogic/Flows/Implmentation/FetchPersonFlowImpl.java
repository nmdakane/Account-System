package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchPersonFlowImpl implements FetchPersonFlow {
    private final PersonTranslator personTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchPeopleFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchPersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
<<<<<<< HEAD
    public PersonDTO getPerson(String email) {
        PersonDTO personDTO = personTranslator.getPersonInfo(email);

        LOGGER.info("Person with id {} is {}", email, personDTO);
=======
    public PersonDTO getPerson(Long id) {
        PersonDTO personDTO = personTranslator.getPerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return personDTO;
    }
}
