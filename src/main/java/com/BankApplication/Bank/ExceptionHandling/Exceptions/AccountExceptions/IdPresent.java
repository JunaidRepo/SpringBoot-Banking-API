package com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions;

public class IdPresent extends RuntimeException{
    public IdPresent(){
        super("id already present");
    }
}
