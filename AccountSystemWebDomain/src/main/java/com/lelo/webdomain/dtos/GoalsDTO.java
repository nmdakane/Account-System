package com.lelo.webdomain.dtos;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lelo.webdomain.persistence.Goals;
import com.lelo.webdomain.persistence.Person;
=======
import com.lelo.webdomain.persistence.Goals;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

import java.io.Serializable;

public class GoalsDTO implements Serializable {
<<<<<<< HEAD
    //private Long personId;
=======
    private Long personId;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    private String spending;
    private String healthandfitness;
    private String driving;

    public GoalsDTO() {
    }

    public GoalsDTO(Goals goals) {
<<<<<<< HEAD
       //this.personId = goals.getPersonId().getId();
=======
        this.personId = goals.getPersonId().getId();
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.spending = goals.getSpending();
        this.healthandfitness = goals.getHealthandfitness();
        this.driving = goals.getDriving();
    }

<<<<<<< HEAD
    public GoalsDTO(String spending, String healthandfitness, String driving) {
        //this.personId = personId;
=======
    public GoalsDTO(Long personId, String spending, String healthandfitness, String driving) {
        this.personId = personId;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.spending = spending;
        this.healthandfitness = healthandfitness;
        this.driving = driving;
    }

<<<<<<< HEAD
    @JsonIgnore
    public Goals buildGoals(Person person){
        return new Goals(null,person,this.getSpending(), this.getHealthandfitness(), this.getDriving());
    }

    /*public Long getPersonId() {
=======
    public Long getPersonId() {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

    public String getSpending() {
        return spending;
    }

    public void setSpending(String spending) {
        this.spending = spending;
    }

    public String getHealthandfitness() {
        return healthandfitness;
    }

    public void setHealthandfitness(String healthandfitness) {
        this.healthandfitness = healthandfitness;
    }

    public String getDriving() {
        return driving;
    }

    public void setDriving(String driving) {
        this.driving = driving;
    }


    @Override
    public String toString() {
        return "GoalsDTO{" +
<<<<<<< HEAD
                //"personId=" + personId +
=======
                "personId=" + personId +
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                ", spending='" + spending + '\'' +
                ", healthandfitness='" + healthandfitness + '\'' +
                ", driving='" + driving + '\'' +
                '}';
    }
}
