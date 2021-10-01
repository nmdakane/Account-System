package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.GoalsDTO;

public interface FetchPersonGoalsFlow {
    GoalsDTO getPersonGoals(Long id);
}
