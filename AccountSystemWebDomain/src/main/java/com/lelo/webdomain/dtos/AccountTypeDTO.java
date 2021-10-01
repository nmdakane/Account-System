package com.lelo.webdomain.dtos;

import com.lelo.webdomain.persistence.AccountType;
import com.lelo.webdomain.persistence.Rewards;
import com.lelo.webdomain.persistence.Transactions;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


public class AccountTypeDTO implements Serializable {
    private String nmonic;
    private LocalDate createdDate;
    private String name;
    private RewardsDTO rewardsDTO;

    public AccountTypeDTO() {
    }

    public AccountTypeDTO(com.lelo.webdomain.persistence.AccountType accountType) {
        this.nmonic = accountType.getNmonic();
        this.name = accountType.getName();
        this.createdDate = accountType.getCreatedDate();
    }

    public AccountTypeDTO(String nmonic, LocalDate createdDate, String name, TransactionsDTO transactionsDTO, RewardsDTO rewardsDTO) {
        this.nmonic = nmonic;
        this.createdDate = createdDate;
        this.name = name;
        this.rewardsDTO = rewardsDTO;
    }

    public String getNmonic() {
        return nmonic;
    }

    public void setNmonic(String nmonic) {
        this.nmonic = nmonic;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RewardsDTO getRewardsDTO() {
        return rewardsDTO;
    }

    public void setRewardsDTO(RewardsDTO rewardsDTO) {
        this.rewardsDTO = rewardsDTO;
    }

    @Override
    public String toString() {
        return "AccountTypeDTO{" +
                "nmonic='" + nmonic + '\'' +
                ", createdDate=" + createdDate +
                ", name='" + name + '\'' +
                '}';
    }
}
