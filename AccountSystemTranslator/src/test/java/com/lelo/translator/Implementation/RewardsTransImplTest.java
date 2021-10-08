package com.lelo.translator.Implementation;

import com.lelo.repo.files.RewardsRepository;
import com.lelo.webdomain.dtos.RewardsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.DependsOn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RewardsTransImplTest {

    @Mock private RewardsRepository repository;

    private RewardsTransImpl rewardsTrans;

    @BeforeEach
    void setUp() {
        rewardsTrans = new RewardsTransImpl(repository);
    }

    @Test
    void getRewards() {
        rewardsTrans.getRewards();
        verify(repository).findAll();
    }

    @Test
    void getReward() {
        RewardsDTO reward = Mockito.mock(RewardsDTO.class);

        when(rewardsTrans. getReward(Long.parseLong(String.valueOf(1)))).thenReturn(reward);
        //rewardsTrans.getReward(Long.parseLong(String.valueOf(1)));
        //verify(repository).getOne(Long.parseLong(String.valueOf(1)));
    }

    @Test
    void updateReward() {
        rewardsTrans.updateReward(Long.parseLong(String.valueOf(1)), 140);
        verify(repository).updateRewardsPriceById(Long.parseLong(String.valueOf(1)), 140);
    }

    @Test
    void deleteReward() {
        rewardsTrans.deleteReward(Long.parseLong(String.valueOf(1)));
        verify(repository).deleteById(Long.parseLong(String.valueOf(1)));
    }

    @Test
    void createReward() {
        RewardsDTO rewardsDTO = new RewardsDTO(
                "Technology",
                "Caynon Mouse",
                "150"
        );
        RewardsDTO created = rewardsTrans.createReward(rewardsDTO);
        verify(repository).save(created.buildReward(rewardsDTO));
    }
}