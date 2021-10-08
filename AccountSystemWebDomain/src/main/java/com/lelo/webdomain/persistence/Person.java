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
    private double currentAmount;
    private Goals goals;
    private List<PersonTransactions> transactions;

    public Person() {
    }


    public Person(Long id, String name, String surname, String phoneNumber, String email, int plays, double currentAmount, Goals goals, List<PersonTransactions> transactions) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.plays = plays;
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

    @Column(name="Person_Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return plays == person.plays && Double.compare(person.currentAmount, currentAmount) == 0 && Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(email, person.email) && Objects.equals(goals, person.goals) && Objects.equals(transactions, person.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumber, email, plays, currentAmount, goals, transactions);
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
                ", Current amount=" + currentAmount +
                '}';
    }
}
