package com.lelo.webdomain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Person")
public class Person implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private int plays;
<<<<<<< HEAD
    private double currentAmount;
    private Goals goals;
    private List<PersonTransactions> transactions;
=======
    private List<Goals> goals;
    private List<Transactions> transactions;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public Person() {
    }


<<<<<<< HEAD
    public Person(Long id, String name, String surname, String phoneNumber, String email, int plays, double currentAmount, Goals goals, List<PersonTransactions> transactions) {
=======
    public Person(Long id, String name, String surname, String phoneNumber, String email, int plays) {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.plays = plays;
<<<<<<< HEAD
        this.currentAmount = currentAmount;
        this.goals = goals;
        this.transactions = transactions;
    }

    public Person(Long id, String name, String surname, String phoneNumber, String email, int plays, double currentAmount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.plays = plays;
        this.currentAmount = currentAmount;
    }

    @Id
    @SequenceGenerator(name="Person_GENERIC_SEQ",sequenceName = "ACCOUNTSYSPerson_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Person_GENERIC_SEQ")
=======
    }

    @Id
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Column(name="Person_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="Plays")
    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    @Column(name="Person_Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="Person_Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name="Person_PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

<<<<<<< HEAD
=======

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Column(name="Person_Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
    @Column(name="Current_amount")
    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }


    @OneToOne(targetEntity = Goals.class, fetch = FetchType.LAZY,mappedBy = "memberEmail")
    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }



    @OneToMany(targetEntity = PersonTransactions.class, fetch = FetchType.LAZY,mappedBy ="memberEmail",orphanRemoval = true)
    public List<PersonTransactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<PersonTransactions> transactions) {
=======
    @OneToMany(targetEntity = Goals.class, fetch = FetchType.LAZY,mappedBy ="personId",orphanRemoval = true)
    public List<Goals> getGoals() {
        return goals;
    }

    public void setGoals(List<Goals> goals) {
        this.goals = goals;
    }

    @OneToMany(targetEntity = Transactions.class, fetch = FetchType.LAZY,mappedBy ="memberId",orphanRemoval = true)
    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
<<<<<<< HEAD
        return plays == person.plays && Double.compare(person.currentAmount, currentAmount) == 0 && Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(email, person.email) && Objects.equals(goals, person.goals) && Objects.equals(transactions, person.transactions);
=======
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(email, person.email);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hash(id, name, surname, phoneNumber, email, plays, currentAmount, goals, transactions);
=======
        return Objects.hash(id, name, surname, phoneNumber, email);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", plays=" + plays +
<<<<<<< HEAD
                ", Current amount=" + currentAmount +
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                '}';
    }
}
