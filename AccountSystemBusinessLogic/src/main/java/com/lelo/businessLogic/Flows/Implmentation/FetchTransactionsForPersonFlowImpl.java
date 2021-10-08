package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchTransactionsForPersonFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchTransactionsForPersonFlowImpl implements FetchTransactionsForPersonFlow {
    private final TransactionsTranslator transactionsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchTransactionsForPersonFlowImpl.class);

    @Autowired
    public FetchTransactionsForPersonFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public List<TransactionsDTO> getTransactionsOfPerson(String  email) {
        List<TransactionsDTO> transactionsDTOS = transactionsTranslator.getTransactionsOfPerson(email);
        LOGGER.info("Transactions of user with email {} : {}" ,email,transactionsDTOS);
        return transactionsDTOS;
    }
}
