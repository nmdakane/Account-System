package com.lelo.translator;


import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Goals;

import java.util.List;

public interface GoalsTranslator {
    List<GoalsDTO> getGoalsPerson();
    GoalsDTO getPersonGoals(String email);
    void goalsUpdateDriving(String email,double goal);
    void goalsUpdateSpending(String email,double goal);
    void goalsUpdateHealthFitness(String email,double goal);
    void deleteGoals(String email);
    GoalsDTO addGoals(PersonDTO personDTO);

}
