package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchTransactionsFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchTransactionFlowImpl implements FetchTransactionsFlow {
    private final TransactionsTranslator transactionsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchTransactionFlowImpl.class);


    @Autowired
    public FetchTransactionFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public List<TransactionsDTO> getAllTransactions() {
        List<TransactionsDTO> transactions= transactionsTranslator.getAllTransactions();
        LOGGER.info("All the transactions added: {}", transactions);
        return transactions;
    }
}
