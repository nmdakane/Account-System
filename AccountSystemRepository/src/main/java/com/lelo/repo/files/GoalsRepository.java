package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Goals;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface GoalsRepository extends JpaRepository<Goals,Long> {
    @Modifying
    @Transactional
    @Query(value = "delete from goals where goals.person_email in (" +
            "select person.person_id from person where person_email =:email)",nativeQuery = true)
    public void deleteByMemberId(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "update goals  set goals.driving=:goal where goals.person_email in(" +
            " select person.person_id from person where person.person_email=:email)",nativeQuery = true)
    public void updateGoalsDrivingByMemberId(@Param("email") String email, @Param("goal") double goal);

    @Modifying
    @Transactional
    @Query(value = "update goals set goals.spending=:goal where goals.person_email in (" +
            "select person.person_id  from person where person.person_email=:email)",nativeQuery = true)
    public void updateGoalsSpendingByMemberId(@Param("email") String email, @Param("goal") double goal);


    @Modifying
    @Transactional
    @Query(value = "update goals set Health_Fitness=:goal  where goals.person_email in (" +
                        "select person.person_id from person where person.person_email=:email)",nativeQuery = true)
    public void updateGoalsSHealthFitnessByMemberId(@Param("email") String email, @Param("goal") double goal);


    @Query(value = "select * from goals join person on " +
            "goals.person_email=person.person_id where person.Person_Email=:email",nativeQuery = true)
    public Goals getGoalsByMemberEmail(@Param("email") String email);

=======
import org.springframework.stereotype.Repository;

@Repository
public interface GoalsRepository extends JpaRepository<Goals,Long> {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
