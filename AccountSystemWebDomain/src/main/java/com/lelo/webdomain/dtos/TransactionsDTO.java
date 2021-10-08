package com.lelo.webdomain.dtos;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
=======
import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.Transactions;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

public class TransactionsDTO {
    private String name;
    private int amount;
<<<<<<< HEAD
    private String type;
    private String accountTypeNmonic;
    private String personEmail;


=======
    //private AccountTypeDTO accountTypeDTO;
   // private PersonDTO personDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public TransactionsDTO() {
    }

<<<<<<< HEAD
=======
    public TransactionsDTO(Transactions transactions) {
        this.name = transactions.getName();
        this.amount = transactions.getAmount();
    }

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    public TransactionsDTO(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

<<<<<<< HEAD
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
=======
    public TransactionsDTO(String name, int amount, AccountTypeDTO accountTypeDTO, Person person) {
        this.name = name;
        this.amount = amount;
        //this.accountTypeDTO = accountTypeDTO;
        //this.personDTO = personDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
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

<<<<<<< HEAD
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
=======
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
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    /*public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }*/

<<<<<<< HEAD
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Override
    public String toString() {
        return "TransactionsDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

}
