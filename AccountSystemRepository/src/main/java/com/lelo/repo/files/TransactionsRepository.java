package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Person;
import com.lelo.webdomain.persistence.PersonTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<PersonTransactions, Long> {
    @Query(value = "select * from person_transactions join person on " +
            "person_transactions.person_email=person.person_id where person.person_email=:email",nativeQuery = true)
    public List<PersonTransactions> getPersonTranctions(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "delete from person_transactions where person_email in (" +
            "select person_id from person where person_email=:id)",nativeQuery = true)
    public void deletePersonTransactionsByEmail(@Param("id") String email);

   /* @Modifying
    @Transactional
    @Query(value = " insert into person_transactions values" +
                "( ':id', 15, 'account created', 'accreated',':default', ':email')",nativeQuery = true)
    void createFirstTransaction(@Param("default") String accountType,@Param("email") String email,@Param("id") Long id);*/
}
