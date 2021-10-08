package com.lelo.webdomain.dtos;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
=======
import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Rewards;
import com.lelo.webdomain.persistence.Transactions;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2


public class AccountTypeDTO implements Serializable {
    private String nmonic;
<<<<<<< HEAD
    private String name;
=======
    private LocalDate createdDate;
    private String name;
    private RewardsDTO rewardsDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public AccountTypeDTO() {
    }

    public AccountTypeDTO(com.lelo.webdomain.persistence.AccountType accountType) {
        this.nmonic = accountType.getNmonic();
        this.name = accountType.getName();
<<<<<<< HEAD
        //this.createdDate = accountType.getCreatedDate();
    }

    public AccountTypeDTO(String nmonic, String name/*, LocalDate createdDateTransactionsDTO transactionsDTO, RewardsDTO rewardsDTO*/) {
        this.nmonic = nmonic;
        //this.createdDate = createdDate;
        this.name = name;
        //this.rewardsDTO = rewardsDTO;
    }

    @JsonIgnore
    public AccountType buildAccountType(AccountTypeDTO accountType){
        return new AccountType(null, accountType.getNmonic(), LocalDate.now(),
        accountType.getName());
=======
        this.createdDate = accountType.getCreatedDate();
    }

    public AccountTypeDTO(String nmonic, LocalDate createdDate, String name, TransactionsDTO transactionsDTO, RewardsDTO rewardsDTO) {
        this.nmonic = nmonic;
        this.createdDate = createdDate;
        this.name = name;
        this.rewardsDTO = rewardsDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    public String getNmonic() {
        return nmonic;
    }

    public void setNmonic(String nmonic) {
        this.nmonic = nmonic;
    }

<<<<<<< HEAD
  /*  public LocalDate getCreatedDate() {
=======
    public LocalDate getCreatedDate() {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

<<<<<<< HEAD
    public RewardsDTO getRewardsDTO() {
        return rewardsDTO;
    }

    public void setRewardsDTO(RewardsDTO rewardsDTO) {
        this.rewardsDTO = rewardsDTO;
    }*/

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
=======
    public RewardsDTO getRewardsDTO() {
        return rewardsDTO;
    }

    public void setRewardsDTO(RewardsDTO rewardsDTO) {
        this.rewardsDTO = rewardsDTO;
    }

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Override
    public String toString() {
        return "AccountTypeDTO{" +
                "nmonic='" + nmonic + '\'' +
<<<<<<< HEAD
               // ", createdDate=" + createdDate +
                //", name='" + name + '\'' +
=======
                ", createdDate=" + createdDate +
                ", name='" + name + '\'' +
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                '}';
    }
}
