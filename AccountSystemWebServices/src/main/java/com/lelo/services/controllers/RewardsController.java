package com.lelo.services.controllers;

import com.lelo.businessLogic.Flows.*;
import com.lelo.webdomain.dtos.RewardsDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Rewards")
public class RewardsController {
    private final UpdateRewardFlow updateRewardFlow;
    private final FetchRewardsFlow fetchRewardsFlow;
    private final FetchRewardFlow fetchRewardFlow;
    private  final DeleteRewardFlow deleteRewardFlow;
    private final CreateRewardFlow createRewardFlow;

    @Autowired
    public RewardsController(UpdateRewardFlow updateRewardFlow, FetchRewardsFlow fetchRewardsFlow, FetchRewardFlow fetchRewardFlow, DeleteRewardFlow deleteRewardFlow, CreateRewardFlow createRewardFlow) {
        this.updateRewardFlow = updateRewardFlow;
        this.fetchRewardsFlow = fetchRewardsFlow;
        this.fetchRewardFlow = fetchRewardFlow;
        this.deleteRewardFlow = deleteRewardFlow;
        this.createRewardFlow = createRewardFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value="Gets all the rewards added" ,notes="Returns a list of rewards")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Rewards returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<List<RewardsDTO>> getAll(){
        List<RewardsDTO> rewardsDTOS = fetchRewardsFlow.getRewards();
        return new ResponseEntity<>(rewardsDTOS, HttpStatus.OK);
    }

    @GetMapping("/reward/")
    @ApiOperation(value="Gets a reward" ,notes="Returns a reward with a specified id")
    @ApiResponses(value={
            @ApiResponse(code=200,message="reward returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<RewardsDTO> getReward(@RequestParam Long id){
        RewardsDTO rewardsDTOS =fetchRewardFlow.getReward(id);
        return new ResponseEntity<>(rewardsDTOS, HttpStatus.OK);
    }

    @PostMapping("/reward/update/")
    @ApiOperation(value="Updates a reward" ,notes="Returns a reward with a that has been updated")
    @ApiResponses(value={
            @ApiResponse(code=200,message="reward returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void updateReward(@RequestParam Long id, @RequestParam double price){
        updateRewardFlow.updateReward(id,price);
    }

    @PutMapping("/create")
    @ApiOperation(value="creates a reward" ,notes="Returns a reward that has been created")
    @ApiResponses(value={
            @ApiResponse(code=200,message="reward returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<RewardsDTO> createReward(@RequestBody RewardsDTO rewardsDTO){
        RewardsDTO reward = createRewardFlow.createReward(rewardsDTO);
        return new ResponseEntity<>(reward, HttpStatus.OK);
    }

    @DeleteMapping("/delete/")
    @ApiOperation(value="Gets a reward" ,notes="Returns a reward with a specified id")
    @ApiResponses(value={
            @ApiResponse(code=200,message="reward returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void deleteReward(@RequestParam Long id){
        deleteRewardFlow.deleteReward(id);
    }
}
