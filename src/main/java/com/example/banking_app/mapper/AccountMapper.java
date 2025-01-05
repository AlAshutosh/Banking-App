package com.example.banking_app.mapper;

import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.entity.Account;

public class AccountMapper {
    
    public static Account maptoAccount(AccountDto accountDto){
        Account account = new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto maptoAccountDto(Account accounts){
        AccountDto accountDto = new AccountDto(
            accounts.getId(),
            accounts.getAccountHolderName(),
            accounts.getBalance()
        );
        return accountDto;
    }
}
