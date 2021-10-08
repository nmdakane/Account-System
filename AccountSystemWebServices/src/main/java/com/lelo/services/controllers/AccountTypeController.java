package com.lelo.services.controllers;

import com.lelo.businessLogic.Flows.*;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account-types")
public class AccountTypeController {
    private final UpdateAccountTypeFlow updateAccountTypeFlow;
    private final FetchUserAccountTypeFlow fetchUserAccountTypeFlow;
    private final FetchAccountTypeFlow fetchAccountTypeFlow;
    private final DeleteAccountTypeFlow deleteAccountTypeFlow;
    private final CreateAccountTypeFlow createAccountTypeFlow;

    @Autowired
    public AccountTypeController(UpdateAccountTypeFlow updateAccountTypeFlow, FetchUserAccountTypeFlow fetchUserAccountTypeFlow, FetchAccountTypeFlow fetchAccountTypeFlow, DeleteAccountTypeFlow deleteAccountTypeFlow, CreateAccountTypeFlow createAccountTypeFlow) {
        this.updateAccountTypeFlow = updateAccountTypeFlow;
        this.fetchUserAccountTypeFlow = fetchUserAccountTypeFlow;
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
        this.deleteAccountTypeFlow = deleteAccountTypeFlow;
        this.createAccountTypeFlow = createAccountTypeFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value="Gets all the account types added" ,notes="Returns a list of account types")
    @ApiResponses(value={
            @ApiResponse(code=200,message="account types returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<List<AccountTypeDTO>> getAll(){
        List<AccountTypeDTO> accountTypeDTOS = fetchAccountTypeFlow.getAccountypes();
        return new ResponseEntity<>(accountTypeDTOS, HttpStatus.OK);
    }

<<<<<<< HEAD
    @GetMapping("/accounttype/{NMonic}")
=======
    @GetMapping("/memberaccounttype/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Gets all the account types added" ,notes="Returns a list of account types")
    @ApiResponses(value={
            @ApiResponse(code=200,message="account types returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public ResponseEntity<AccountTypeDTO> getMemberAccountType(@RequestParam String Nmonic){
        AccountTypeDTO accountTypememberDTO = fetchUserAccountTypeFlow.getAccountType(Nmonic);
        return new ResponseEntity<>(accountTypememberDTO, HttpStatus.OK);
    }

    /*@PostMapping("/update/{id}")
=======
    public ResponseEntity<AccountTypeDTO> getMemberAccountType(Long id){
        AccountTypeDTO accountTypememberDTO = fetchUserAccountTypeFlow.getAccountType(id);
        return new ResponseEntity<>(accountTypememberDTO, HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Gets all the account types added" ,notes="Returns a list of account types")
    @ApiResponses(value={
            @ApiResponse(code=200,message="account types returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<AccountTypeDTO> update(Long id){
        AccountTypeDTO accountTypeupdateDTO = updateAccountTypeFlow.updateAccountType(id);
        return new ResponseEntity<>(accountTypeupdateDTO, HttpStatus.OK);
<<<<<<< HEAD
    }*/

    @DeleteMapping("/delete/{nmonic}")
=======
    }

    @DeleteMapping("/delete/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Gets all the account types added" ,notes="Returns a list of account types")
    @ApiResponses(value={
            @ApiResponse(code=200,message="account types returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public void delete(@RequestParam String Nmonic){
        deleteAccountTypeFlow.deleteAccountType(Nmonic);
=======
    public void delete(Long id){
        deleteAccountTypeFlow.deleteAccountType(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }


    @PutMapping("/add")
    @ApiOperation(value="Gets all the account types added" ,notes="Returns a list of account types")
    @ApiResponses(value={
            @ApiResponse(code=200,message="account types returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public void addAccountType(@RequestBody AccountTypeDTO accountTypeDTO){
        createAccountTypeFlow.createAccountType(accountTypeDTO);
    }





}
