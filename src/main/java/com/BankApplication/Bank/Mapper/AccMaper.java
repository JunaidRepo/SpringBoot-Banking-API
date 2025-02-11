package com.BankApplication.Bank.Mapper;

import com.BankApplication.Bank.DTO.AccountDto;
import com.BankApplication.Bank.Entity.Account;

public class AccMaper {

    public static AccountDto maptoAccDto(Account act){
        return new AccountDto(act.getAccNo(),act.getHolderName(),act.getBalance());
    }
    public static Account maptoAcc(AccountDto act){
        return new Account(act.getAno(),act.getHname(),act.getBal());
    }
}
