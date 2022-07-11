package br.com.spring.studentCard.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class TransactionDto {

    @NotNull
    private BigDecimal transactionValue;

    @NotNull
    private long studentId;


    public BigDecimal getTransactionValue() {
        return this.transactionValue;
    }

    public void setTransactionValue(BigDecimal transactionValue) {
        this.transactionValue = transactionValue;
    }

    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    
}
