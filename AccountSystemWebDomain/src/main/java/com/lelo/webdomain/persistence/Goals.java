package com.lelo.webdomain.persistence;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Goals")
public class Goals {
    private Long id;
    private Person personId;
    private String spending;
    private String healthandfitness;
    private String driving;

    public Goals() {
    }

    public Goals(Long id, Person personId, String spending, String healthandfitness, String driving) {
        this.id = id;
        this.personId = personId;
        this.spending = spending;
        this.healthandfitness = healthandfitness;
        this.driving = driving;
    }

    @Id
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
    @Column(name="Goals_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_ID")
    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @Column(name="Spending")
    public String getSpending() {
        return spending;
    }

    public void setSpending(String spending) {
        this.spending = spending;
    }

    @Column(name="Health_Fitness")
    public String getHealthandfitness() {
        return healthandfitness;
    }

    public void setHealthandfitness(String healthandfitness) {
        this.healthandfitness = healthandfitness;
    }

    @Column(name="Driving")
    public String getDriving() {
        return driving;
    }

    public void setDriving(String driving) {
        this.driving = driving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goals goals = (Goals) o;
        return Objects.equals(id, goals.id) && Objects.equals(personId, goals.personId) && Objects.equals(spending, goals.spending) && Objects.equals(healthandfitness, goals.healthandfitness) && Objects.equals(driving, goals.driving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personId, spending, healthandfitness, driving);
    }

    @Override
    public String toString() {
        return "Goals{" +
                "id=" + id +
                ", personId=" + personId +
                ", spending='" + spending + '\'' +
                ", healthandfitness='" + healthandfitness + '\'' +
                ", driving='" + driving + '\'' +
                '}';
    }
}
