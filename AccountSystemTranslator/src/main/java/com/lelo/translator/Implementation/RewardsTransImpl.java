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
    public void updateReward(Long id, double price) {
        try {
            rewardsRepository.updateRewardsPriceById(id,price);
        }catch (Exception e){
            throw new RuntimeException("Cannot update goals into the db",e);
        }
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
        Rewards rewards1 = new Rewards();
        try {
             rewards1.setId(null);
             rewards1.setAmount(rewards.getAmount());
             rewards1.setName(rewards.getName());
             rewards1.setCategory(rewards.getCategory());
            rewardsRepository.save(rewards1);
        }catch (Exception e){
            throw new RuntimeException("Cannot add rewards to the db the db",e);
        }
        return rewards;
    }
}
