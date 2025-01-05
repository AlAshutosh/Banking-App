package com.example.banking_app.dto;

import com.example.banking_app.entity.Account;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;
    
    public static AccountDto maptoAccount(Account account) {
        return null;
    }

}
