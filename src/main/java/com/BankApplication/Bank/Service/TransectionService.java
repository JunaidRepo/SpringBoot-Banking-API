package com.BankApplication.Bank.Service;

import org.springframework.stereotype.Service;
@Service
public interface TransectionService {
	
	public double deposit(int id,double amt);
	public double withdraw(int id,double amt);
	

}
