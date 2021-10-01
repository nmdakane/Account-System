package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards,Long> {
}
