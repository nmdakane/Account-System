package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Goals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalsRepository extends JpaRepository<Goals,Long> {
}
