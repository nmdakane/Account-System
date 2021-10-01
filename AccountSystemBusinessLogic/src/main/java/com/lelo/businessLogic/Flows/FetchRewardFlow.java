package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.RewardsDTO;

public interface FetchRewardFlow {
    RewardsDTO getReward(Long id);
}
