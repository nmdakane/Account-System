package com.lelo.translator.Implementation;

import com.lelo.repo.files.GoalsRepository;
import com.lelo.translator.GoalsTranslator;
import com.lelo.webdomain.dtos.GoalsDTO;
import com.lelo.webdomain.persistence.Goals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GoalsTransImpl implements GoalsTranslator {
    private final GoalsRepository goalsRepository;

    @Autowired
    public GoalsTransImpl(GoalsRepository goalsRepository) {
        this.goalsRepository = goalsRepository;
    }

    @Override
    public List<GoalsDTO> getGoals() {
        List<GoalsDTO> goalsDTOS = new ArrayList<>();
        try {
            for(Goals goals:goalsRepository.findAll()){
                goalsDTOS.add(new GoalsDTO(goals));
            }
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return goalsDTOS;
    }

    @Override
    public GoalsDTO getPersonGoals(Long id) {
        Goals goals;
        try {
            goals = goalsRepository.getOne(id);
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return new GoalsDTO(goals);
    }

    @Override
    public GoalsDTO goalsUpdate(Long id) {
        Goals goals = goalsRepository.getOne(id);
        try {
            goalsRepository.save(goals);
        }catch (Exception e){
            throw new RuntimeException("Cannot get all goals from the db",e);
        }
        return new GoalsDTO(goals);
    }

    @Override
    public void deleteGoals(Long id) {
        try {
            goalsRepository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Cannot delete person's goals from the db",e);
        }
    }
}
