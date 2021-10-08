package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.GoalsDTO;

import java.util.List;

public interface FetchGoalsFlow {
    List<GoalsDTO> getGoalsPerson();
    GoalsDTO getPersonGoals(String email);
}
