package com.lelo.translator.Implementation;

<<<<<<< HEAD
import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.repo.files.PersonRepository;
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.slf4j.Logger;
=======
import com.lelo.repo.files.TransactionsRepository;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.Transactions;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionsTransImpl implements TransactionsTranslator {
    private final TransactionsRepository transactionsRepository;
<<<<<<< HEAD
    private final AccountTypeRepository accountTypeRepository;
    private final PersonRepository personRepositoryl;


    @Autowired
    public TransactionsTransImpl(TransactionsRepository transactionsRepository, AccountTypeRepository accountTypeRepository, PersonRepository personRepositoryl) {
        this.transactionsRepository = transactionsRepository;
        this.accountTypeRepository = accountTypeRepository;
        this.personRepositoryl = personRepositoryl;
    }






=======

    @Autowired
    public TransactionsTransImpl(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Override
    public List<TransactionsDTO> getAllTransactions() {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
<<<<<<< HEAD
            for (PersonTransactions personTransactions :transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(personTransactions));
=======
            for (Transactions transactions:transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(transactions));
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
<<<<<<< HEAD
    public List<TransactionsDTO> getTransactionsOfPerson(String email) {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (PersonTransactions personTransactions :transactionsRepository.getPersonTranctions(email)){
                transactionsList.add(new TransactionsDTO(personTransactions));
=======
    public List<TransactionsDTO> getTransactionsOfPerson(Person id) {
        List<TransactionsDTO> transactionsList= new ArrayList<>();
        try {
            for (Transactions transactions:transactionsRepository.findAll()){
                transactionsList.add(new TransactionsDTO(transactions));
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
            }

        }catch(Exception e){
            throw new RuntimeException("Cannot get the transactions",e);
        }
        return transactionsList;
    }

    @Override
    public TransactionsDTO createTransaction(TransactionsDTO transactions) {
<<<<<<< HEAD
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
=======
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
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
