package com.lelo.services.controllers;

import com.lelo.businessLogic.Flows.*;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.persistence.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/members")
public class PersonController {
    private final FetchPersonFlow fetchPersonFlow;
    private final FetchPeopleFlow fetchPeopleFlow;
    private final DeletePersonFlow deletePersonFlow;
    private final CreatePersonFlow createPersonFlow;
    private final UpdatePersonFlow updatePersonFlow;

    @Autowired
    public PersonController(FetchPersonFlow fetchPersonFlow, FetchPeopleFlow fetchPeopleFlow, DeletePersonFlow deletePersonFlow, CreatePersonFlow createPersonFlow, UpdatePersonFlow updatePersonFlow) {
        this.fetchPersonFlow = fetchPersonFlow;
        this.fetchPeopleFlow = fetchPeopleFlow;
        this.deletePersonFlow = deletePersonFlow;
        this.createPersonFlow = createPersonFlow;
        this.updatePersonFlow = updatePersonFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value="Gets all the Members added" ,notes="Returns a list of members")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Members returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<List<com.lelo.webdomain.dtos.PersonDTO>> getAll(){
        List<com.lelo.webdomain.dtos.PersonDTO> personDTODTOS = fetchPeopleFlow.getPeople();
        return new ResponseEntity<>(personDTODTOS, HttpStatus.OK);
    }

<<<<<<< HEAD
    @GetMapping("/member/")
=======
    @GetMapping("/member/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Gets a Member" ,notes="Returns one member with the specified id")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Member returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public ResponseEntity<com.lelo.webdomain.dtos.PersonDTO> getMember(@RequestParam String email){
        com.lelo.webdomain.dtos.PersonDTO member = fetchPersonFlow.getPerson(email);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @DeleteMapping("/member/")
=======
    public ResponseEntity<com.lelo.webdomain.dtos.PersonDTO> getMember(@RequestParam Long id){
        com.lelo.webdomain.dtos.PersonDTO member = fetchPersonFlow.getPerson(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @DeleteMapping("/member/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Delete a Member" ,notes="Deletes one member with the specified id")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Member deleted"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public void deleteMember(@RequestParam String email){
        deletePersonFlow.deletePerson(email);
=======
    public void deleteMember(@RequestParam Long id){
        deletePersonFlow.deletePerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }

    @PutMapping("/member/")
    @ApiOperation(value="Add a new Member" ,notes="Adds one member and creates a new id")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Member added"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void addMember(@RequestBody PersonDTO person){
        createPersonFlow.addPerson(person);
    }

<<<<<<< HEAD
    @PostMapping("/member/")
    @ApiOperation(value="update a Member's phone" ,notes="updates one member with the specified id")
=======
    @PostMapping("/member/{id}")
    @ApiOperation(value="update a new Member" ,notes="updates one member with the specified id")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiResponses(value={
            @ApiResponse(code=200,message="Member added"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public void updateMember(@RequestParam String email ,@RequestParam String phonenumber){
        updatePersonFlow.updatePerson(email,phonenumber);
=======
    public void updateMember(@RequestParam Long id ,@RequestBody com.lelo.webdomain.dtos.PersonDTO personDTO){
        updatePersonFlow.updatePerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
