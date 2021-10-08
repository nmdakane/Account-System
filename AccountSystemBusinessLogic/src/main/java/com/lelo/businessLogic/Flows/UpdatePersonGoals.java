package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.dtos.PersonDTO;

public interface UpdatePersonGoals {
    void goalsUpdateDriving(String email,double goal);
    void goalsUpdateSpending(String email,double goal);
    void goalsUpdateHealthFitness(String email,double goal);


}
