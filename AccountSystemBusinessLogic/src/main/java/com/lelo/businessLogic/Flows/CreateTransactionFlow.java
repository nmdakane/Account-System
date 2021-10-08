package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.TransactionsDTO;

public interface CreateTransactionFlow {
    TransactionsDTO createTransaction(TransactionsDTO transactions);

}
