package br.com.spring.studentCard.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.studentCard.dto.TransactionDto;
import br.com.spring.studentCard.models.Transaction;
import br.com.spring.studentCard.services.TransactionService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/transaction")
@Tag(name = "Transação", description = "Recursos da API de Transações")
public class TransactionController {
    
    final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Transaction>> findById(@PathVariable long id) 
    {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody @Valid TransactionDto transactionDto) throws Exception
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.save(transactionDto));
    }    
}
