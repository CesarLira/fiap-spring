package br.com.spring.studentCard.dto;

import javax.validation.constraints.NotBlank;

public class StudentDto {

    @NotBlank
    private String name;

    @NotBlank
    private String cardNumber;

    @NotBlank
    private String accountNumber;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }    

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}
