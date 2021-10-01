package com.lelo.translator.Implementation;

import com.lelo.repo.files.RewardsRepository;
import com.lelo.translator.RewardsTranslator;
import com.lelo.webdomain.dtos.RewardsDTO;
import com.lelo.webdomain.persistence.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RewardsTransImpl implements RewardsTranslator {
    private final RewardsRepository rewardsRepository;

    @Autowired
    public RewardsTransImpl(RewardsRepository rewardsRepository) {
        this.rewardsRepository = rewardsRepository;
    }

    @Override
    public List<RewardsDTO> getRewards() {
        List<RewardsDTO> rewardsDTOS = new ArrayList<>();
        try {
            for (Rewards reward: rewardsRepository.findAll()){
                rewardsDTOS.add(new RewardsDTO(reward));
            }
        }catch (Exception e){
            throw new RuntimeException("Cannot get rewards from the db",e);
        }
        return rewardsDTOS;
    }

    @Override
    public RewardsDTO getReward(Long id) {
        Rewards rewards;
        try {
            rewards = rewardsRepository.getOne(id);
        }catch (Exception e){
            throw new RuntimeException("Cannot get goal from the db with that id",e);
        }
        return new RewardsDTO(rewards);
    }

    @Override
    public RewardsDTO updateReward(Long id) {
        Rewards rewards = rewardsRepository.getOne(id);
        try {
            rewardsRepository.save(rewards);
        }catch (Exception e){
            throw new RuntimeException("Cannot update goals into the db",e);
        }
        return new RewardsDTO(rewards);
    }

    @Override
    public void deleteReward(Long id) {
        try {
            rewardsRepository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Cannot delete goals from the db",e);
        }
    }

    @Override
    public RewardsDTO createReward(RewardsDTO rewards) {
        return null;
    }
}
