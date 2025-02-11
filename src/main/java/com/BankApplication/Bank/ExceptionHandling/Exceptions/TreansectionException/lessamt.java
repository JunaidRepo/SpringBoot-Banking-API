package com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException;

public class lessamt extends RuntimeException {
	public lessamt() {
		super("no sufficient balance");
	}

}
