package com.lelo.services.controllers;

import com.lelo.businessLogic.Flows.CreateTransactionFlow;
import com.lelo.businessLogic.Flows.FetchTransactionsFlow;
import com.lelo.businessLogic.Flows.FetchTransactionsForPersonFlow;
<<<<<<< HEAD
import com.lelo.businessLogic.Flows.UpdatePersonFlow;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import com.lelo.webdomain.dtos.TransactionsDTO;
import com.lelo.webdomain.persistence.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionsController {
    private final FetchTransactionsFlow fetchTransactionsFlow;
    private final FetchTransactionsForPersonFlow fetchTransactionsForPersonFlow;
    private final CreateTransactionFlow createTransactionFlow;
<<<<<<< HEAD
    private final UpdatePersonFlow updatePersonFlow;

    @Autowired
    public TransactionsController(FetchTransactionsFlow fetchTransactionsFlow, FetchTransactionsForPersonFlow fetchTransactionsForPersonFlow, CreateTransactionFlow createTransactionFlow, UpdatePersonFlow updatePersonFlow) {
        this.fetchTransactionsFlow = fetchTransactionsFlow;
        this.fetchTransactionsForPersonFlow = fetchTransactionsForPersonFlow;
        this.createTransactionFlow = createTransactionFlow;
        this.updatePersonFlow = updatePersonFlow;
    }




=======

    @Autowired
    public TransactionsController(FetchTransactionsFlow fetchTransactionsFlow, FetchTransactionsForPersonFlow fetchTransactionsForPersonFlow, CreateTransactionFlow createTransactionFlow) {
        this.fetchTransactionsFlow = fetchTransactionsFlow;
        this.fetchTransactionsForPersonFlow = fetchTransactionsForPersonFlow;
        this.createTransactionFlow = createTransactionFlow;
    }

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @GetMapping("/all")
    @ApiOperation(value="Gets all the transactions" ,notes="Returns a list of transactions so far")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Transactions returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
    public ResponseEntity<List<TransactionsDTO>> getAll(){
        List<TransactionsDTO> transactionsDTOS = fetchTransactionsFlow.getAllTransactions();
        return new ResponseEntity<>(transactionsDTOS, HttpStatus.OK);
    }

    @PutMapping("/create")
    @ApiOperation(value="creates new transactions" ,notes="create a new transaction")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Transactions created"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public ResponseEntity<TransactionsDTO> create(@RequestBody TransactionsDTO transactionsDTO){
        TransactionsDTO transactionsDTOS = createTransactionFlow.createTransaction(transactionsDTO);
        updatePersonFlow.updateAmount(transactionsDTO.getPersonEmail(), transactionsDTOS);
        return new ResponseEntity<>(transactionsDTOS, HttpStatus.OK);
    }

    @GetMapping("/member/")
=======
    public ResponseEntity<TransactionsDTO> create(TransactionsDTO transactionsDTO){
        TransactionsDTO transactionsDTOS = createTransactionFlow.createTransaction(transactionsDTO);
        return new ResponseEntity<>(transactionsDTOS, HttpStatus.OK);
    }

    @GetMapping("/member/{id}")
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @ApiOperation(value="Gets all the transactions" ,notes="Returns a list of transactions so far")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Transactions returned"),
            @ApiResponse(code=400,message="Bad request"),
            @ApiResponse(code=404,message="Not found"),
            @ApiResponse(code=500,message="Internal Server error")
    })
<<<<<<< HEAD
    public ResponseEntity<List<TransactionsDTO>> getMemberTransaction(@RequestParam String email){
        List<TransactionsDTO> transactionsDTOS = fetchTransactionsForPersonFlow.getTransactionsOfPerson(email);
=======
    public ResponseEntity<List<TransactionsDTO>> getMemberTransaction(@RequestParam Person id){
        List<TransactionsDTO> transactionsDTOS = fetchTransactionsForPersonFlow.getTransactionsOfPerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return new ResponseEntity<>(transactionsDTOS, HttpStatus.OK);
    }

}
