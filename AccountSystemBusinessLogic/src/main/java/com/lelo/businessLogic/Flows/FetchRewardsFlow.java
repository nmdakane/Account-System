package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.RewardsDTO;

import java.util.List;

public interface FetchRewardsFlow {
    List<RewardsDTO> getRewards();
}
