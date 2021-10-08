package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchGoalsFlowImpl implements FetchGoalsFlow {
    private final GoalsTranslator goalsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchGoalsFlowImpl.class);

    @Autowired
    public FetchGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
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
}
