package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Transactions;

public interface CreateTransactionFlow {
    TransactionsDTO createTransaction(TransactionsDTO transactions);
}
