package br.com.spring.studentCard.models;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private BigDecimal transactionValue;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student studentTransaction;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getTransactionValue() {
        return this.transactionValue;
    }

    public void setTransactionValue(BigDecimal transactionValue) {
        this.transactionValue = transactionValue;
    }

    public Student getStudentTransaction() {
        return this.studentTransaction;
    }

    public void setStudentTransaction(Student student) {
        this.studentTransaction = student;
    } 

    public Transaction() {
    }

    public Transaction(long id, BigDecimal transactionValue, Student studentTransaction) {
        this.id = id;
        this.transactionValue = transactionValue;
        this.studentTransaction = studentTransaction;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", transactionValue='" + getTransactionValue() + "'" +
            ", studentTransactions='" + getStudentTransaction() + "'" +
            "}";
    }
    
}
