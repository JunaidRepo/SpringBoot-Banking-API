package com.BankApplication.Bank.Service;


import com.BankApplication.Bank.DTO.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    AccountDto insert(AccountDto acc);
    AccountDto update(AccountDto acc);
    void delete(int id);
    List<AccountDto> getAll();
}
