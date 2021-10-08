package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPeopleFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchPeopleFlowImpl implements FetchPeopleFlow {
    private final PersonTranslator personTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchPeopleFlowImpl.class);


=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchPeopleFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public List<PersonDTO> getPeople() {
        List<PersonDTO> personDTOS = personTranslator.getPeople();
<<<<<<< HEAD
        LOGGER.info("Returned People from the database {}", personDTOS);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return personDTOS;
    }
}
