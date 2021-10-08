package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonGoals;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePersonGoalsFlowImpl implements UpdatePersonGoals {
    private final GoalsTranslator goalsTranslator;

    @Autowired
    public UpdatePersonGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
    public void goalsUpdateDriving(String email, double goal) {
        goalsTranslator.goalsUpdateDriving(email,goal);
    }

    @Override
    public void goalsUpdateSpending(String email, double goal) {
        goalsTranslator.goalsUpdateSpending(email, goal);
    }

    @Override
    public void goalsUpdateHealthFitness(String email, double goal) {
        goalsTranslator.goalsUpdateHealthFitness(email, goal);
    }
}
