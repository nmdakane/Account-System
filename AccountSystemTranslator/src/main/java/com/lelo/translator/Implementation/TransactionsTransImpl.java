package com.lelo.translator.Implementation;

import com.lelo.repo.files.TransactionsRepository;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionsTransImpl implements TransactionsTranslator {
    private final TransactionsRepository transactionsRepository;

    @Autowired
    public TransactionsTransImpl(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    @Override
    public List<TransactionsDTO> getAllTransactions() {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (Transactions transactions:transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(transactions));
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
    public List<TransactionsDTO> getTransactionsOfPerson(Person id) {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (Transactions transactions:transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(transactions));
            }

        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
    public TransactionsDTO createTransaction(TransactionsDTO transactions) {
        Transactions transactions1 = new Transactions();
        try {
            transactions1.setId(null);
            transactions1.setName(transactions.getName());
            //transactions1.setAccountType(transactions.);
            transactions1.setAmount(transactions.getAmount());
            //transactions1.setMemberId(transactions.getPerson());
            transactionsRepository.save(transactions1);
        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return new TransactionsDTO(transactions1);
    }
}
