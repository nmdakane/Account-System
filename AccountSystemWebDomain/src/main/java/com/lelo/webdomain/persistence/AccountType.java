package com.lelo.webdomain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Account_type")
public class AccountType implements Serializable {
    private Long id;
    private String nmonic;
    private LocalDate createdDate;
    private String name;
    private Set<Transactions> transactions;
    private Set<Rewards> rewards;

    public AccountType() {
    }

    public AccountType(Long id, String nmonic, LocalDate createdDate, String name) {
        this.id = id;
        this.nmonic = nmonic;
        this.createdDate = createdDate;
        this.name = name;
    }

    public AccountType(Long id, String nmonic, LocalDate createdDate, String name, Set<Transactions> transactions) {
        this.id = id;
        this.nmonic = nmonic;
        this.createdDate = createdDate;
        this.name = name;
        this.transactions = transactions;
    }

    public AccountType(Long id, String nmonic, LocalDate createdDate, String name, Set<Transactions> transactions, Set<Rewards> rewards) {
        this.id = id;
        this.nmonic = nmonic;
        this.createdDate = createdDate;
        this.name = name;
        this.transactions = transactions;
        this.rewards = rewards;
    }

    @Id
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
    @Column(name="Account_type_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="Account_type_Nmonic")
    public String getNmonic() {
        return nmonic;
    }

    public void setNmonic(String nmonic) {
        this.nmonic = nmonic;
    }

    @Column(name="Date_created")
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name="Account_type_Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(targetEntity = Transactions.class, fetch = FetchType.LAZY, mappedBy = "accountType" ,orphanRemoval = true)
    public Set<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transactions> transactions) {
        this.transactions = transactions;
    }

    @OneToMany(targetEntity = Rewards.class,fetch = FetchType.LAZY,mappedBy = "accountType",orphanRemoval = true)
    public Set<Rewards> getRewards() {
        return rewards;
    }

    public void setRewards(Set<Rewards> rewards) {
        this.rewards = rewards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(id, that.id) && Objects.equals(nmonic, that.nmonic) && Objects.equals(createdDate, that.createdDate) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nmonic, createdDate, name);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "id=" + id +
                ", nmonic='" + nmonic + '\'' +
                ", createdDate=" + createdDate +
                ", name='" + name + '\'' +
                '}';
    }
}
