package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchRewardFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchRewardFlowImpl implements FetchRewardFlow {
    private final RewardsTranslator rewardsTranslator;

    @Autowired
    public FetchRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public RewardsDTO getReward(Long id) {
        RewardsDTO rewardsDTO = rewardsTranslator.getReward(id);
        return rewardsDTO;
    }
}
