package com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions;

public class updatebal extends RuntimeException{
	public updatebal() {
		super("can't update balance without deposit or withdraw ");
		// TODO Auto-generated constructor stub
	}

}
