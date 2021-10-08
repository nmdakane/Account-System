package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Person;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query(value = "select * from person where Person_Email=:email",nativeQuery = true)
    public Person getPerson(@Param("email") String email);

    @Query(value = "select plays from person where Person_Email=:email",nativeQuery = true)
    public int getPlays(@Param("email") String email);

    @Query(value = "select current_amount from person where Person_Email=:email",nativeQuery = true)
    public double getCurrentAmount(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "update person set Plays=:plays where person_email=:email",nativeQuery = true)
    public void updatePlaysByEmail(@Param("email") String email, @Param("plays") int plays);

    @Modifying
    @Transactional
    @Query(value = "update person set person_phone_number=:phonenum where person_email=:email",nativeQuery = true)
    public void updatePhoneByEmail(@Param("email") String email, @Param("phonenum") String phone);


    @Modifying
    @Transactional
    @Query(value = "update person set current_amount=:amount where person_email=:email",nativeQuery = true)
    public void updateAmountByEmail(@Param("email") String email, @Param("amount") double amount);
=======
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
