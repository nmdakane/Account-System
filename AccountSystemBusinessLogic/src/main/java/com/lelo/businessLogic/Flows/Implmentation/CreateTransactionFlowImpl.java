package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateTransactionFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateTransactionFlowImpl implements CreateTransactionFlow {
    private final TransactionsTranslator transactionsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateTransactionFlowImpl.class);


    @Autowired
    public CreateTransactionFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public TransactionsDTO createTransaction(TransactionsDTO transactions) {
        TransactionsDTO transactionsDTO = transactionsTranslator.createTransaction(transactions);
        LOGGER.info("Creating a transaction {}",transactionsDTO);
        return transactionsDTO;
    }
}
