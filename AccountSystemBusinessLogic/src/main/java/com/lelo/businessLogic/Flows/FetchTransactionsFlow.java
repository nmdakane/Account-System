package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.TransactionsDTO;

import java.util.List;

public interface FetchTransactionsFlow {
    List<TransactionsDTO> getAllTransactions();
}
