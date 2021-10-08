package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.GoalsDTO;
<<<<<<< HEAD
import com.lelo.webdomain.dtos.PersonDTO;

public interface UpdatePersonGoals {
    void goalsUpdateDriving(String email,double goal);
    void goalsUpdateSpending(String email,double goal);
    void goalsUpdateHealthFitness(String email,double goal);


=======

public interface UpdatePersonGoals {
    GoalsDTO goalsUpdate(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
