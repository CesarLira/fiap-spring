package br.com.spring.studentCard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.studentCard.models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {}