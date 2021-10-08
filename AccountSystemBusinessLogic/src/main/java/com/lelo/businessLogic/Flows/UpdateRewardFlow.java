package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.RewardsDTO;

public interface UpdateRewardFlow {
    void updateReward(Long id, double price);
}
