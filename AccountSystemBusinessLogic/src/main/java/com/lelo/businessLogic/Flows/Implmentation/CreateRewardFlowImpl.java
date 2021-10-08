package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateRewardFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateRewardFlowImpl implements CreateRewardFlow {
    private final RewardsTranslator rewardsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateRewardFlowImpl.class);

    @Autowired
    public CreateRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public RewardsDTO createReward(RewardsDTO rewards) {
        RewardsDTO rewardsDTO = rewardsTranslator.createReward(rewards);
        LOGGER.info("Create Reward {}",rewardsDTO);
        return rewardsDTO;
    }
}
