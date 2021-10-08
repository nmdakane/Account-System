package com.lelo.webdomain.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;


public class AccountTypeDTO implements Serializable {
    private String nmonic;
    private String name;

    public AccountTypeDTO() {
    }

    public AccountTypeDTO(com.lelo.webdomain.persistence.AccountType accountType) {
        this.nmonic = accountType.getNmonic();
        this.name = accountType.getName();
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
    }

    public String getNmonic() {
        return nmonic;
    }

    public void setNmonic(String nmonic) {
        this.nmonic = nmonic;
    }

  /*  public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public RewardsDTO getRewardsDTO() {
        return rewardsDTO;
    }

    public void setRewardsDTO(RewardsDTO rewardsDTO) {
        this.rewardsDTO = rewardsDTO;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AccountTypeDTO{" +
                "nmonic='" + nmonic + '\'' +
               // ", createdDate=" + createdDate +
                //", name='" + name + '\'' +
                '}';
    }
}
