package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonGoals;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
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
<<<<<<< HEAD
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
=======
    public GoalsDTO goalsUpdate(Long id) {
        GoalsDTO goalsDTO = goalsTranslator.goalsUpdate(id);
        return goalsDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
