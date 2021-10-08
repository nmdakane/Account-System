package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreatePersonFlow;
<<<<<<< HEAD
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.translator.GoalsTranslator;
import com.lelo.translator.PersonTranslator;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
import com.lelo.translator.PersonTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonFlowImpl implements CreatePersonFlow {
    private final PersonTranslator personTranslator;
<<<<<<< HEAD
    private final GoalsTranslator goalsTranslator;
    private final TransactionsTranslator transactionsTranslator;
    private final AccountTypeTranslator accountTypeTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(CreatePersonFlowImpl.class);

    @Autowired
    public CreatePersonFlowImpl(PersonTranslator personTranslator, GoalsTranslator goalsTranslator, TransactionsTranslator transactionsTranslator, AccountTypeTranslator accountTypeTranslator) {
        this.personTranslator = personTranslator;
        this.goalsTranslator = goalsTranslator;
        this.transactionsTranslator = transactionsTranslator;
        this.accountTypeTranslator = accountTypeTranslator;
    }





    @Override
    public PersonDTO addPerson(PersonDTO person) {
        LOGGER.info("Create person {} by dto",person);
        PersonDTO personDTO = personTranslator.addPerson(person);
        goalsTranslator.addGoals(person);
        //transactionsTranslator.createDefaultTransaction("DEFAULT",person.getEmail());
=======

    @Autowired
    public CreatePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO addPerson(PersonDTO person) {
        PersonDTO personDTO = personTranslator.addPerson(person);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return personDTO;
    }
}
