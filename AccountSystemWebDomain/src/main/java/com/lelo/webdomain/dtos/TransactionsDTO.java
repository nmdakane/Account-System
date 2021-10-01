package com.lelo.webdomain.dtos;

import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.Transactions;

public class TransactionsDTO {
    private String name;
    private int amount;
    //private AccountTypeDTO accountTypeDTO;
   // private PersonDTO personDTO;

    public TransactionsDTO() {
    }

    public TransactionsDTO(Transactions transactions) {
        this.name = transactions.getName();
        this.amount = transactions.getAmount();
    }

    public TransactionsDTO(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public TransactionsDTO(String name, int amount, AccountTypeDTO accountTypeDTO, Person person) {
        this.name = name;
        this.amount = amount;
        //this.accountTypeDTO = accountTypeDTO;
        //this.personDTO = personDTO;
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

    /*public AccountTypeDTO getAccountType() {
        return accountTypeDTO;
    }

    public void setAccountType(AccountTypeDTO accountTypeDTO) {
        this.accountTypeDTO = accountTypeDTO;
    }

    public PersonDTO getPerson() {
        return personDTO;
    }

    public void setPerson(PersonDTO personDTO) {
        this.personDTO = personDTO;
    }*/

    /*public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }*/

    @Override
    public String toString() {
        return "TransactionsDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}
