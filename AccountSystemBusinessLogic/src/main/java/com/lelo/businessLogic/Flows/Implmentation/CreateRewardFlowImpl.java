package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateRewardFlow;
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
public class CreateRewardFlowImpl implements CreateRewardFlow {
    private final RewardsTranslator rewardsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateRewardFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public CreateRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public RewardsDTO createReward(RewardsDTO rewards) {
        RewardsDTO rewardsDTO = rewardsTranslator.createReward(rewards);
<<<<<<< HEAD
        LOGGER.info("Create Reward {}",rewardsDTO);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return rewardsDTO;
    }
}
