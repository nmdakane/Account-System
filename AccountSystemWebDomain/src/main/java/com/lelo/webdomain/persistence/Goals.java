package com.lelo.webdomain.persistence;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Goals")
public class Goals {
    private Long id;
    private Person memberEmail;
    private String spending;
    private String healthandfitness;
    private String driving;

    public Goals() {
    }

    public Goals(Long id, Person personId, String spending, String healthandfitness, String driving) {
        this.id = id;
        this.memberEmail = personId;
        this.spending = spending;
        this.healthandfitness = healthandfitness;
        this.driving = driving;
    }

    @Id
    @SequenceGenerator(name="Goals_GENERIC_SEQ",sequenceName = "ACCOUNTSYSGoals_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Goals_GENERIC_SEQ")
    @Column(name="Goals_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_Email")
    public Person getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(Person memberId) {
        this.memberEmail = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goals goals = (Goals) o;
        return Objects.equals(id, goals.id) && Objects.equals(memberEmail, goals.memberEmail) && Objects.equals(spending, goals.spending) && Objects.equals(healthandfitness, goals.healthandfitness) && Objects.equals(driving, goals.driving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberEmail, spending, healthandfitness, driving);
    }

    @Override
    public String toString() {
        return "Goals{" +
                "id=" + id +
                ", personemail=" + memberEmail +
                ", spending='" + spending + '\'' +
                ", healthandfitness='" + healthandfitness + '\'' +
                ", driving='" + driving + '\'' +
                '}';
    }
}
