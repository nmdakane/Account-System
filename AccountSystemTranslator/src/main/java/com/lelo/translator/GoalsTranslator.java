package com.lelo.translator;


import com.lelo.webdomain.dtos.GoalsDTO;
<<<<<<< HEAD
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Goals;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

import java.util.List;

public interface GoalsTranslator {
<<<<<<< HEAD
    List<GoalsDTO> getGoalsPerson();
    GoalsDTO getPersonGoals(String email);
    void goalsUpdateDriving(String email,double goal);
    void goalsUpdateSpending(String email,double goal);
    void goalsUpdateHealthFitness(String email,double goal);
    void deleteGoals(String email);
    GoalsDTO addGoals(PersonDTO personDTO);

=======
    List<GoalsDTO> getGoals();
    GoalsDTO getPersonGoals(Long id);
    GoalsDTO goalsUpdate(Long id);
    void deleteGoals(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
