package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchTransactionsForPersonFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchTransactionsForPersonFlowImpl implements FetchTransactionsForPersonFlow {
    private final TransactionsTranslator transactionsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchTransactionsForPersonFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchTransactionsForPersonFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
<<<<<<< HEAD
    public List<TransactionsDTO> getTransactionsOfPerson(String  email) {
        List<TransactionsDTO> transactionsDTOS = transactionsTranslator.getTransactionsOfPerson(email);
        LOGGER.info("Transactions of user with email {} : {}" ,email,transactionsDTOS);
=======
    public List<TransactionsDTO> getTransactionsOfPerson(Person id) {
        List<TransactionsDTO> transactionsDTOS = transactionsTranslator.getTransactionsOfPerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return transactionsDTOS;
    }
}
