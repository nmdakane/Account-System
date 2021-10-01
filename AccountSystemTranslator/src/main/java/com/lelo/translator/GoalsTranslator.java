package com.lelo.translator;


import com.lelo.webdomain.dtos.GoalsDTO;

import java.util.List;

public interface GoalsTranslator {
    List<GoalsDTO> getGoals();
    GoalsDTO getPersonGoals(Long id);
    GoalsDTO goalsUpdate(Long id);
    void deleteGoals(Long id);
}
