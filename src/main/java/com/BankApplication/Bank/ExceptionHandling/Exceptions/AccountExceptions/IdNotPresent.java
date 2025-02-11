package com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions;

public class IdNotPresent extends RuntimeException{

    public IdNotPresent(){
        super("id wasn't present");
    }
}
