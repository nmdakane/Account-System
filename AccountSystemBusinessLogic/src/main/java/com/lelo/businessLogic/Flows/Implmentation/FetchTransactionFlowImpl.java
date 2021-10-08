package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchTransactionsFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchTransactionFlowImpl implements FetchTransactionsFlow {
    private final TransactionsTranslator transactionsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchTransactionFlowImpl.class);


=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchTransactionFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public List<TransactionsDTO> getAllTransactions() {
        List<TransactionsDTO> transactions= transactionsTranslator.getAllTransactions();
<<<<<<< HEAD
        LOGGER.info("All the transactions added: {}", transactions);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return transactions;
    }
}
