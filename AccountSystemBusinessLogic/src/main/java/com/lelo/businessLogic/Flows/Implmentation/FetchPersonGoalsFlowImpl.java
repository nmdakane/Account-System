package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchPersonGoalsFlowImpl implements FetchPersonGoalsFlow {
    private final GoalsTranslator goalsTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchPersonGoalsFlowImpl.class);

    @Autowired
    public FetchPersonGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
    public GoalsDTO getPersonGoals(String email) {
        GoalsDTO goalsDTO = goalsTranslator.getPersonGoals(email);
        LOGGER.info("Person's goals with the email {} are {}",email, goalsDTO);
        return goalsDTO;
    }
}
