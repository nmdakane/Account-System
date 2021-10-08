package com.lelo.translator.Implementation;

import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionsTransImpl implements TransactionsTranslator {
    private final TransactionsRepository transactionsRepository;
    private final AccountTypeRepository accountTypeRepository;
    private final PersonRepository personRepositoryl;


    @Autowired
    public TransactionsTransImpl(TransactionsRepository transactionsRepository, AccountTypeRepository accountTypeRepository, PersonRepository personRepositoryl) {
        this.transactionsRepository = transactionsRepository;
        this.accountTypeRepository = accountTypeRepository;
        this.personRepositoryl = personRepositoryl;
    }






    @Override
    public List<TransactionsDTO> getAllTransactions() {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (PersonTransactions personTransactions :transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(personTransactions));
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
    public List<TransactionsDTO> getTransactionsOfPerson(String email) {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (PersonTransactions personTransactions :transactionsRepository.getPersonTranctions(email)){
                transactionsList.add(new TransactionsDTO(personTransactions));
            }

        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
    public TransactionsDTO createTransaction(TransactionsDTO transactions) {
        PersonTransactions personTransactions;
        Person person;
        try {
            AccountType accountType = accountTypeRepository.getAccountTypeByNmonic(transactions.getAccountTypeNmonic());
            person = personRepositoryl.getPerson(transactions.getPersonEmail());
            personTransactions = transactions.buildTransaction(accountType,person);
            transactionsRepository.save(personTransactions);
        }catch(Exception e){
            throw new RuntimeException("Cannot save transaction into the transactions bd",e);
        }
        return new TransactionsDTO(personTransactions);
    }


    @Override
    public void deleteTransactionsByEmail(String email) {
        try {
            transactionsRepository.deletePersonTransactionsByEmail(email);
        }catch(Exception e){
            throw new RuntimeException("Cannot delete transactions with that id bd",e);
        }
    }
}
