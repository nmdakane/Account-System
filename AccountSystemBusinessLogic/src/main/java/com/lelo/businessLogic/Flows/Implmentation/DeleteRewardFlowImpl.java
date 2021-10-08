package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeleteRewardFlow;
import com.lelo.translator.RewardsTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteRewardFlowImpl implements DeleteRewardFlow {
    private final RewardsTranslator rewardsTranslator;

    @Autowired
    public DeleteRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public void deleteReward(Long id) {
        rewardsTranslator.deleteReward(id);
    }
}
