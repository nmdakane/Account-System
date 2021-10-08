package com.lelo.webdomain.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;

public class TransactionsDTO {
    private String name;
    private int amount;
    private String type;
    private String accountTypeNmonic;
    private String personEmail;



    public TransactionsDTO() {
    }

    public TransactionsDTO(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public TransactionsDTO(String name, int amount, String accountTypeNmonic, String person, String type) {
        this.name = name;
        this.amount = amount;
        this.accountTypeNmonic = accountTypeNmonic;
        this.personEmail = person;
        this.type = type;
    }

    public TransactionsDTO(PersonTransactions personTransactions) {
        this.name = personTransactions.getName();
        this.amount = personTransactions.getAmount();
        this.type = personTransactions.getType();
        this.accountTypeNmonic = personTransactions.getAccountType().getNmonic();
        this.personEmail = personTransactions.getMemberEmail().getEmail();
    }

    @JsonIgnore
    public PersonTransactions buildTransaction(AccountType accountType, Person person){
        return new PersonTransactions(null,this.getName(),this.getType(), accountType, person,this.getAmount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAccountTypeNmonic() {
        return accountTypeNmonic;
    }

    public void setAccountTypeNmonic(String accountTypeDTO) {
        this.accountTypeNmonic = accountTypeDTO;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    /*public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransactionsDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}
