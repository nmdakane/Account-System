package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateTransactionFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateTransactionFlowImpl implements CreateTransactionFlow {
    private final TransactionsTranslator transactionsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateTransactionFlowImpl.class);


=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public CreateTransactionFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public TransactionsDTO createTransaction(TransactionsDTO transactions) {
        TransactionsDTO transactionsDTO = transactionsTranslator.createTransaction(transactions);
<<<<<<< HEAD
        LOGGER.info("Creating a transaction {}",transactionsDTO);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return transactionsDTO;
    }
}
