package com.lelo.webdomain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PersonTransactions")
public class PersonTransactions implements Serializable {
    private Long id;
    private String name;
    private String type;
    private AccountType accountType;
    private Person memberEmail;
    private int amount;

    public PersonTransactions() {
    }

    public PersonTransactions(Long id, String name, String type, AccountType accountType, Person memberId, int amount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.accountType = accountType;
        this.memberEmail = memberId;
        this.amount = amount;
    }

    @Id
    @SequenceGenerator(name="PT_GENERIC_SEQ",sequenceName = "ACCOUNTSYSPT_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PT_GENERIC_SEQ")
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
    @JoinColumn(name="Account_type_Nmonic")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_Email")
    public Person getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(Person memberId) {
        this.memberEmail = memberId;
    }

    @Column(name = "TransactionAmount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Column(name = "TransactionType")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTransactions that = (PersonTransactions) o;
        return amount == that.amount && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(accountType, that.accountType) && Objects.equals(memberEmail, that.memberEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, accountType, memberEmail, amount);
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", accountType=" + accountType +
                ", person email=" + memberEmail +
                ", amount=" + amount +
                '}';
    }
}
