package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchPersonGoalsFlowImpl implements FetchPersonGoalsFlow {
    private final GoalsTranslator goalsTranslator;

    @Autowired
    public FetchPersonGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
    public GoalsDTO getPersonGoals(Long id) {
        GoalsDTO goalsDTO = goalsTranslator.getPersonGoals(id);
        return goalsDTO;
    }
}
