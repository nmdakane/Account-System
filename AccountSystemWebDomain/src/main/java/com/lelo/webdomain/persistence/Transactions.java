package com.lelo.webdomain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Transactions")
public class Transactions implements Serializable {
    private Long id;
    private String name;
    private AccountType accountType;
    private Person memberId;
    private int amount;

    public Transactions() {
    }

    public Transactions(Long id, String name, AccountType accountType, Person memberId, int amount) {
        this.id = id;
        this.name = name;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
    }

    @Id
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
    @Column(name="Transaction_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="Transaction_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Account_type_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_ID")
    public Person getMemberId() {
        return memberId;
    }

    public void setMemberId(Person memberId) {
        this.memberId = memberId;
    }

    @Column(name = "Transaction Amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return amount == that.amount && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(accountType, that.accountType) && Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, accountType, memberId, amount);
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountType=" + accountType +
                ", personid=" + memberId +
                ", amount=" + amount +
                '}';
    }
}
