package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchRewardsFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchRewardsFlowImpl implements FetchRewardsFlow {
    private final RewardsTranslator rewardsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchRewardsFlowImpl.class);


    @Autowired
    public FetchRewardsFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public List<RewardsDTO> getRewards() {
        List<RewardsDTO> rewardsDTOS = rewardsTranslator.getRewards();
        LOGGER.info("All the rewards returned from the database are {}",rewardsDTOS);
        return rewardsDTOS;
    }
}
