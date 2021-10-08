package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeleteGoalsFlow;
import com.lelo.translator.GoalsTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteGoalsFlowImpl implements DeleteGoalsFlow {
    private final GoalsTranslator goalsTranslator;

    @Autowired
    public DeleteGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
    public void deleteGoals(String email) {
        goalsTranslator.deleteGoals(email);
    }
}
