package com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException;

public class udervalue extends RuntimeException {
	public udervalue() {
		super("under value: amount is less than 1");
	}
}

