package com.lelo.repo.files;

import com.lelo.webdomain.persistence.AccountType;
<<<<<<< HEAD
import com.lelo.webdomain.persistence.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType,Long> {
<<<<<<< HEAD
    @Query(value = "select * from account_type where account_type.account_type_nmonic=:nmonic",nativeQuery = true)
    public AccountType getAccountTypeByNmonic(@Param("nmonic") String nmonic);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
