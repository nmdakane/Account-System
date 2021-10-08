package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchGoalsFlowImpl implements FetchGoalsFlow {
    private final GoalsTranslator goalsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchGoalsFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
<<<<<<< HEAD
    public List<GoalsDTO> getGoalsPerson() {
        List<GoalsDTO> goalsDTOS= goalsTranslator.getGoalsPerson();
        LOGGER.info("Returned values of goals are {}", goalsDTOS);
        return goalsDTOS;
    }

    @Override
    public GoalsDTO getPersonGoals(String email) {
        LOGGER.info("Returned goals of member with email {} are {}", email, goalsTranslator.getPersonGoals(email));
        return goalsTranslator.getPersonGoals(email);
    }
=======
    public List<GoalsDTO> getGoals() {
        List<GoalsDTO> goalsDTOS= goalsTranslator.getGoals();
        return goalsDTOS;
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
