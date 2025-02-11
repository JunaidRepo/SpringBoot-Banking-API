package com.BankApplication.Bank.Service.ServiceImplementation;

import com.BankApplication.Bank.DTO.AccountDto;
import com.BankApplication.Bank.Entity.Account;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.IdNotPresent;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.IdPresent;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.updatebal;
import com.BankApplication.Bank.Mapper.AccMaper;
import com.BankApplication.Bank.Repository.AccountRepo;
import com.BankApplication.Bank.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountImp implements AccountService {
    @Autowired
    AccountRepo repo;
    @Override
    public AccountDto insert(AccountDto acc) {
    	if (repo.existsById(acc.getAno())) {
    	    throw new IdPresent();
    	}

    	
        Account a=AccMaper.maptoAcc(acc);
        Account ant=repo.save(a);
        return AccMaper.maptoAccDto(ant);
    }

    @Override
    public AccountDto update(AccountDto acc) {
        Account a=AccMaper.maptoAcc(acc);
        Optional<Account>op=repo.findById(a.getAccNo());
        op.orElseThrow(IdNotPresent::new);
        if(op.get().getBalance() !=acc.getBal()) throw new updatebal();
        Account ant=repo.save(a);
        return AccMaper.maptoAccDto(ant);
    }

    @Override
    public void delete(int id) {

        Optional<Account>op=repo.findById(id);
        op.orElseThrow(IdNotPresent::new);
        repo.deleteById(id);
    }

    

    
    @Override
    public List<AccountDto> getAll() {

        List<Account> l1=repo.findAll();
        if(l1.isEmpty()) throw new RuntimeException("no data was present");
        return l1.stream().map(AccMaper::maptoAccDto).toList();
    }



}
