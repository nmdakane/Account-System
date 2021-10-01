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
        List<GoalsDTO> goalsDTOS = fetchGoalsFlow.getGoals();
        return new ResponseEntity<>(goalsDTOS, HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    @ApiOperation(value="Update person's goals" ,notes="Updates a member's goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Members returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void updateMemberGoals(@RequestParam Long id, @RequestBody GoalsDTO goalsDTO){
        updatePersonGoals.goalsUpdate(id);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value="Update person's goals" ,notes="Updates a member's goals")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Members returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void deleteMemberGoals(@RequestParam Long id){
        deleteGoalsFlow.deleteGoals(id);
    }




}
