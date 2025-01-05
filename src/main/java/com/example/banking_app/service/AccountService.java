package com.example.banking_app.service;

import java.util.List;
import com.example.banking_app.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto depoit(Long id ,double balance);

    AccountDto withdraw(Long id ,double balance);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
