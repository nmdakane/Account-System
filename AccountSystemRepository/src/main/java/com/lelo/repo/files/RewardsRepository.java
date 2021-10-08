package com.lelo.repo.files;

import com.lelo.webdomain.persistence.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards,Long> {
    @Modifying
    @Transactional
    @Query(value = "update rewards set Reward_amount=:price where Reward_id=:id",nativeQuery = true)
    public void updateRewardsPriceById(@Param("id") Long id, @Param("price") double price);

    @Modifying
    @Transactional
    @Query(value = "select amount from rewards where reward_name =:price where Reward_id=:id",nativeQuery = true)
    public void updateRewardsPriceById(@Param("id") Long id, @Param("price") double price);
}
