package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdateRewardFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateRewardFlowImpl implements UpdateRewardFlow {
    private final RewardsTranslator rewardsTranslator;

    @Autowired
    public UpdateRewardFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
<<<<<<< HEAD
    public void updateReward(Long id,double price) {
        rewardsTranslator.updateReward(id,price);
=======
    public RewardsDTO updateReward(Long id) {
        RewardsDTO rewardsDTO = rewardsTranslator.updateReward(id);
        return null;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
