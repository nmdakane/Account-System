package com.lelo.translator;

import com.lelo.webdomain.dtos.RewardsDTO;

import java.util.*;

public interface RewardsTranslator {
    List<RewardsDTO> getRewards();
    RewardsDTO getReward(Long id);
<<<<<<< HEAD
    void updateReward(Long id,double price);
=======
    RewardsDTO updateReward(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    void deleteReward(Long id);
    RewardsDTO createReward(RewardsDTO rewards);
}
