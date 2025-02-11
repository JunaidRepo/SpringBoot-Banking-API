package com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException;

public class Overlimit extends RuntimeException {
	public Overlimit() {
		super("Limit Exceded: amount sholud be less than 100000");
	}
}
