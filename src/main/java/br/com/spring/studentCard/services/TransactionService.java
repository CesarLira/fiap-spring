package br.com.spring.studentCard.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.spring.studentCard.dto.TransactionDto;
import br.com.spring.studentCard.models.Student;
import br.com.spring.studentCard.models.Transaction;
import br.com.spring.studentCard.repositories.StudentRepository;
import br.com.spring.studentCard.repositories.TransactionRepository;

@Service
public class TransactionService {

    final TransactionRepository transactionRepository;
    final StudentRepository studentRepository;

    public TransactionService(
        TransactionRepository transactionRepository,
        StudentRepository studentRepository) {
            this.transactionRepository = transactionRepository;
            this.studentRepository = studentRepository;
    }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public Transaction save(TransactionDto transactionDto) throws Exception {
        
        var transaction = new Transaction();
        BeanUtils.copyProperties(transactionDto, transaction);

        Student student = studentRepository.getById(transactionDto.getStudentId());

        if(student == null) 
        {
            throw new Exception("Student not found");
        }

        transaction.setStudentTransaction(student);
        List<Transaction> transactionsList = new ArrayList<Transaction>();
        transactionsList.add(transaction);
        student.setTransactions(transactionsList);

        return transactionRepository.save(transaction);
    }
    
}
