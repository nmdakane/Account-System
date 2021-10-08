package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchRewardFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchRewardFlowImpl implements FetchRewardFlow {
    private final RewardsTranslator rewardsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchRewardFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public RewardsDTO getReward(Long id) {
        RewardsDTO rewardsDTO = rewardsTranslator.getReward(id);
<<<<<<< HEAD
        LOGGER.info("Reward with id {} is {}",id,rewardsDTO);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return rewardsDTO;
    }
}
