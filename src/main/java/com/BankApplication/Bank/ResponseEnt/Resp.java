package com.BankApplication.Bank.ResponseEnt;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class Resp<T> {
    private int statusCode;
    private String msg;
    T data;
    private LocalDateTime date;
    
}
