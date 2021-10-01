package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonGoals;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
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
    public GoalsDTO goalsUpdate(Long id) {
        GoalsDTO goalsDTO = goalsTranslator.goalsUpdate(id);
        return goalsDTO;
    }
}
