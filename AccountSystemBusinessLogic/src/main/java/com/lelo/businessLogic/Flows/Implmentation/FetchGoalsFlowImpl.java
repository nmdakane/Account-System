package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchGoalsFlowImpl implements FetchGoalsFlow {
    private final GoalsTranslator goalsTranslator;

    @Autowired
    public FetchGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
    public List<GoalsDTO> getGoals() {
        List<GoalsDTO> goalsDTOS= goalsTranslator.getGoals();
        return goalsDTOS;
    }
}
