package com.lelo.translator;

import com.lelo.webdomain.dtos.RewardsDTO;

import java.util.*;

public interface RewardsTranslator {
    List<RewardsDTO> getRewards();
    RewardsDTO getReward(Long id);
    void updateReward(Long id,double price);
    void deleteReward(Long id);
    RewardsDTO createReward(RewardsDTO rewards);
}
