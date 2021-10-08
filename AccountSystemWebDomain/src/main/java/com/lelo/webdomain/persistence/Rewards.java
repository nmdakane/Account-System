package com.lelo.webdomain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Rewards")
public class Rewards implements Serializable {
    private Long id;
    private String category;
    private String name;
    private String amount;
<<<<<<< HEAD
=======
    private AccountType accountType;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public Rewards() {
    }

    public Rewards(Long id, String category, String name, String amount) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.amount = amount;
    }

<<<<<<< HEAD

    @Id
    @SequenceGenerator(name="Rewards_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Rewards_GENERIC_SEQ")
=======
    public Rewards(Long id, String category, String name, String amount, AccountType accountType) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.amount = amount;
        this.accountType = accountType;
    }

    @Id
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Column(name="Reward_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="Reward_Category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="Reward_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="Reward_amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

<<<<<<< HEAD
=======
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Account_type_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rewards rewards = (Rewards) o;
        return Objects.equals(id, rewards.id) && Objects.equals(category, rewards.category) && Objects.equals(name, rewards.name) && Objects.equals(amount, rewards.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, amount);
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
