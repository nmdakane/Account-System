package com.lelo.webdomain.dtos;

import java.io.Serializable;
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.Person;
import java.util.*;
=======
import com.lelo.webdomain.persistence.Person;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

public class PersonDTO implements Serializable {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
<<<<<<< HEAD
    private int game_plays;
    private double currentAmount;
    private GoalsDTO goalsDTO;
=======
    private int plays;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public PersonDTO() {
    }

<<<<<<< HEAD
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
=======
    public PersonDTO(Person personDTO) {
        this.name = personDTO.getName();
        this.surname = personDTO.getSurname();
        this.email = personDTO.getEmail();
        this.phoneNumber= personDTO.getPhoneNumber();
        this.plays = personDTO.getPlays();
    }

    public PersonDTO(String name, String surname, String phoneNumber, String email,int plays) {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
<<<<<<< HEAD
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
=======
        this.plays = plays;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
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

<<<<<<< HEAD
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
=======
    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
<<<<<<< HEAD
                ", game_plays='" + game_plays + '\'' +
                ", current amount='" + currentAmount + '\'' +
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                '}';
    }


}
