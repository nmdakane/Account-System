package com.lelo.webdomain.persistence;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Goals")
public class Goals {
    private Long id;
<<<<<<< HEAD
    private Person memberEmail;
=======
    private Person personId;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    private String spending;
    private String healthandfitness;
    private String driving;

    public Goals() {
    }

    public Goals(Long id, Person personId, String spending, String healthandfitness, String driving) {
        this.id = id;
<<<<<<< HEAD
        this.memberEmail = personId;
=======
        this.personId = personId;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        this.spending = spending;
        this.healthandfitness = healthandfitness;
        this.driving = driving;
    }

    @Id
<<<<<<< HEAD
    @SequenceGenerator(name="Goals_GENERIC_SEQ",sequenceName = "ACCOUNTSYSGoals_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Goals_GENERIC_SEQ")
=======
    @SequenceGenerator(name="Disc_GENERIC_SEQ",sequenceName = "ACCOUNTSYS_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Disc_GENERIC_SEQ")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Column(name="Goals_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_ID")
    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

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

<<<<<<< HEAD
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Person_Email")
    public Person getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(Person memberId) {
        this.memberEmail = memberId;
    }

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goals goals = (Goals) o;
<<<<<<< HEAD
        return Objects.equals(id, goals.id) && Objects.equals(memberEmail, goals.memberEmail) && Objects.equals(spending, goals.spending) && Objects.equals(healthandfitness, goals.healthandfitness) && Objects.equals(driving, goals.driving);
=======
        return Objects.equals(id, goals.id) && Objects.equals(personId, goals.personId) && Objects.equals(spending, goals.spending) && Objects.equals(healthandfitness, goals.healthandfitness) && Objects.equals(driving, goals.driving);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hash(id, memberEmail, spending, healthandfitness, driving);
=======
        return Objects.hash(id, personId, spending, healthandfitness, driving);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @Override
    public String toString() {
        return "Goals{" +
                "id=" + id +
<<<<<<< HEAD
                ", personemail=" + memberEmail +
=======
                ", personId=" + personId +
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                ", spending='" + spending + '\'' +
                ", healthandfitness='" + healthandfitness + '\'' +
                ", driving='" + driving + '\'' +
                '}';
    }
}
