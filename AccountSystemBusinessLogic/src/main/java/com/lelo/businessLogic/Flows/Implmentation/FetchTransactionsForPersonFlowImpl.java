package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchTransactionsForPersonFlow;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchTransactionsForPersonFlowImpl implements FetchTransactionsForPersonFlow {
    private final TransactionsTranslator transactionsTranslator;

    @Autowired
    public FetchTransactionsForPersonFlowImpl(TransactionsTranslator transactionsTranslator) {
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public List<TransactionsDTO> getTransactionsOfPerson(Person id) {
        List<TransactionsDTO> transactionsDTOS = transactionsTranslator.getTransactionsOfPerson(id);
        return transactionsDTOS;
    }
}
