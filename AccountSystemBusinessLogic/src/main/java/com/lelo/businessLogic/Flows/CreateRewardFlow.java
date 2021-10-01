package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.RewardsDTO;
import com.lelo.webdomain.persistence.Rewards;

public interface CreateRewardFlow {
    RewardsDTO createReward(RewardsDTO rewards);
}
