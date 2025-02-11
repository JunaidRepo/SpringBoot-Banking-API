package com.BankApplication.Bank.Service.ServiceImplementation;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApplication.Bank.Entity.Account;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.IdNotPresent;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.Overlimit;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.lessamt;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.udervalue;
import com.BankApplication.Bank.Repository.AccountRepo;
import com.BankApplication.Bank.Service.TransectionService;

@Service
public class Tranctionimp implements TransectionService{
	@Autowired
    AccountRepo repo;
	
	@Override
	public double withdraw(int id,double amt) {
		
		
	     Optional<Account>op=repo.findById(id);
	     op.orElseThrow(IdNotPresent::new);
        Account acc=op.get();
        double bal=acc.getBalance();
		if(amt>bal) {
			throw new lessamt();
		}
		if(amt<=0) throw new udervalue();
		if(amt>=100000) throw new Overlimit();
		bal-=amt;
		acc.setBalance(bal);
		 repo.save(acc);
		return bal;
	}

	@Override
	public double deposit(int id,double amt) {
		Optional<Account>op=repo.findById(id);
        op.orElseThrow(IdNotPresent::new);
        Account acc=op.get();
        double bal=acc.getBalance();
        if(amt<=0) throw new udervalue();
        if(amt>=100000)  throw new Overlimit();
        bal+=amt;
		acc.setBalance(bal);
		repo.save(acc);
		return bal;
	}

}
