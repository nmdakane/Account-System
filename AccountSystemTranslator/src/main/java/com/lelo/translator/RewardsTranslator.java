package com.lelo.translator;

import com.lelo.webdomain.dtos.RewardsDTO;

import java.util.*;

public interface RewardsTranslator {
    List<RewardsDTO> getRewards();
    RewardsDTO getReward(Long id);
    RewardsDTO updateReward(Long id);
    void deleteReward(Long id);
    RewardsDTO createReward(RewardsDTO rewards);
}
