package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchRewardsFlow;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchRewardsFlowImpl implements FetchRewardsFlow {
    private final RewardsTranslator rewardsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchRewardsFlowImpl.class);


=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchRewardsFlowImpl(RewardsTranslator rewardsTranslator) {
        this.rewardsTranslator = rewardsTranslator;
    }

    @Override
    public List<RewardsDTO> getRewards() {
        List<RewardsDTO> rewardsDTOS = rewardsTranslator.getRewards();
<<<<<<< HEAD
        LOGGER.info("All the rewards returned from the database are {}",rewardsDTOS);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return rewardsDTOS;
    }
}
