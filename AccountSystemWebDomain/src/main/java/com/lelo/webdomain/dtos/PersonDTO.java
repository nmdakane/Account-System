package com.lelo.webdomain.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.Person;
import java.util.*;

public class PersonDTO implements Serializable {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private int game_plays;
    private double currentAmount;
    private GoalsDTO goalsDTO;

    public PersonDTO() {
    }

    public PersonDTO(Person person) {
        this.name = person.getName();
        this.surname = person.getSurname();
        this.email = person.getEmail();
        this.phoneNumber= person.getPhoneNumber();
        this.game_plays = person.getPlays();
        if(null != person.getGoals()){
            this.goalsDTO = new GoalsDTO(person.getGoals());
        }

    }

    public PersonDTO(String name, String surname, String phoneNumber, String email, int plays,double amount, GoalsDTO goalsDTO) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.game_plays = plays;
        this.currentAmount = amount;
        this.goalsDTO = goalsDTO;
    }

    @JsonIgnore
     public Person buildPerson(PersonDTO personDTO){
        return new Person(null, personDTO.getName(),
                personDTO.getSurname(),
                personDTO.getPhoneNumber(),
                personDTO.getEmail(),
                personDTO.getGame_plays(),
                personDTO.getCurrentAmount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }*/

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int getGame_plays() {
        return game_plays;
    }

    public void setGame_plays(int game_plays) {
        this.game_plays = game_plays;
    }

    public GoalsDTO getGoalsDTO() {
        return goalsDTO;
    }

    public void setGoalsDTO(GoalsDTO goalsDTO) {
        this.goalsDTO = goalsDTO;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", game_plays='" + game_plays + '\'' +
                ", current amount='" + currentAmount + '\'' +
                '}';
    }


}
