package com.lelo.services.controllers;

import com.lelo.businessLogic.Flows.DeleteGoalsFlow;
import com.lelo.businessLogic.Flows.FetchGoalsFlow;
import com.lelo.businessLogic.Flows.UpdatePersonGoals;
import com.lelo.webdomain.dtos.GoalsDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/goals")
public class GoalsController {
    private final UpdatePersonGoals updatePersonGoals;
    private final FetchGoalsFlow fetchGoalsFlow;
    private final DeleteGoalsFlow deleteGoalsFlow;

    @Autowired
    public GoalsController(UpdatePersonGoals updatePersonGoals, FetchGoalsFlow fetchGoalsFlow, DeleteGoalsFlow deleteGoalsFlow) {
        this.updatePersonGoals = updatePersonGoals;
        this.fetchGoalsFlow = fetchGoalsFlow;
        this.deleteGoalsFlow = deleteGoalsFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value="Gets all the goals" ,notes="Returns a list of members' goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="goals returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<List<GoalsDTO>> getAll(){
<<<<<<< HEAD
        List<GoalsDTO> goalsDTOS = fetchGoalsFlow.getGoalsPerson();
        return new ResponseEntity<>(goalsDTOS, HttpStatus.OK);
    }

    @GetMapping("/")
    @ApiOperation(value="Gets all the goals by email" ,notes="Returns a list of members' goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="goals returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<GoalsDTO> getGoalsByEmail(@RequestParam String email){
        GoalsDTO goalsDTOS = fetchGoalsFlow.getPersonGoals(email);
        return new ResponseEntity<>(goalsDTOS, HttpStatus.OK);
    }

    @PostMapping("/updateDriving/{id}")
    @ApiOperation(value="Update person's driving goals" ,notes="Updates a member's goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Driving goal returned"),
=======
        List<GoalsDTO> goalsDTOS = fetchGoalsFlow.getGoals();
        return new ResponseEntity<>(goalsDTOS, HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    @ApiOperation(value="Update person's goals" ,notes="Updates a member's goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Members returned"),
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public void updateMemberDrivingGoals(@RequestParam String email, @RequestParam double driving){
        updatePersonGoals.goalsUpdateDriving(email,driving);
    }

    @PostMapping("/updateSpending/{id}")
    @ApiOperation(value="Update person's Spending goals" ,notes="Updates a member's Spanding goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Spending goal returned"),
=======
    public void updateMemberGoals(@RequestParam Long id, @RequestBody GoalsDTO goalsDTO){
        updatePersonGoals.goalsUpdate(id);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value="Update person's goals" ,notes="Updates a member's goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Members returned"),
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public void updateMemberspendingGoals(@RequestParam String email, @RequestParam double spending){
        updatePersonGoals.goalsUpdateSpending(email,spending);
    }

    @PostMapping("/updateHealthandFitness/")
    @ApiOperation(value="Update person's Health and fitness goals" ,notes="Updates a member's HF goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Health and fitness goal updated"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void updateMemberHealthFitnessGoals(@RequestParam String email, @RequestParam double healthfitness){
        updatePersonGoals.goalsUpdateHealthFitness(email,healthfitness);
    }



=======
    public void deleteMemberGoals(@RequestParam Long id){
        deleteGoalsFlow.deleteGoals(id);
    }

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2



}
