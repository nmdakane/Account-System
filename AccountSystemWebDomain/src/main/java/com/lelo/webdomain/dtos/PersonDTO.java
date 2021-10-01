package com.lelo.webdomain.dtos;

import java.io.Serializable;
import com.lelo.webdomain.persistence.Person;

public class PersonDTO implements Serializable {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private int plays;

    public PersonDTO() {
    }

    public PersonDTO(Person personDTO) {
        this.name = personDTO.getName();
        this.surname = personDTO.getSurname();
        this.email = personDTO.getEmail();
        this.phoneNumber= personDTO.getPhoneNumber();
        this.plays = personDTO.getPlays();
    }

    public PersonDTO(String name, String surname, String phoneNumber, String email,int plays) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.plays = plays;
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

    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
