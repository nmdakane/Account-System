package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchRewardsFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchRewardsFlowImpl implements FetchRewardsFlow {
    private final RewardsTranslator rewardsTranslator;

    @Autowired
    public FetchRewardsFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public List<RewardsDTO> getRewards() {
        List<RewardsDTO> rewardsDTOS = rewardsTranslator.getRewards();
        return rewardsDTOS;
    }
}
