package com.lelo.repo.files;

import com.lelo.webdomain.persistence.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType,Long> {
}
