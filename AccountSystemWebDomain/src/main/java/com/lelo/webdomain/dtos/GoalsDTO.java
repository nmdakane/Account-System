package com.lelo.webdomain.dtos;

import com.lelo.webdomain.persistence.Goals;

import java.io.Serializable;

public class GoalsDTO implements Serializable {
    private Long personId;
    private String spending;
    private String healthandfitness;
    private String driving;

    public GoalsDTO() {
    }

    public GoalsDTO(Goals goals) {
        this.personId = goals.getPersonId().getId();
        this.spending = goals.getSpending();
        this.healthandfitness = goals.getHealthandfitness();
        this.driving = goals.getDriving();
    }

    public GoalsDTO(Long personId, String spending, String healthandfitness, String driving) {
        this.personId = personId;
        this.spending = spending;
        this.healthandfitness = healthandfitness;
        this.driving = driving;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

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
                "personId=" + personId +
                ", spending='" + spending + '\'' +
                ", healthandfitness='" + healthandfitness + '\'' +
                ", driving='" + driving + '\'' +
                '}';
    }
}
