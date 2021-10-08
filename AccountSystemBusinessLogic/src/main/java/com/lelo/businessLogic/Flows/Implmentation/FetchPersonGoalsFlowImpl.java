package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchPersonGoalsFlow;
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
public class FetchPersonGoalsFlowImpl implements FetchPersonGoalsFlow {
    private final GoalsTranslator goalsTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchPersonGoalsFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchPersonGoalsFlowImpl(GoalsTranslator goalsTranslator) {
        this.goalsTranslator = goalsTranslator;
    }

    @Override
<<<<<<< HEAD
    public GoalsDTO getPersonGoals(String email) {
        GoalsDTO goalsDTO = goalsTranslator.getPersonGoals(email);
        LOGGER.info("Person's goals with the email {} are {}",email, goalsDTO);
=======
    public GoalsDTO getPersonGoals(Long id) {
        GoalsDTO goalsDTO = goalsTranslator.getPersonGoals(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return goalsDTO;
    }
}
