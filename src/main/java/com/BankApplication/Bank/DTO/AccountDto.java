package com.BankApplication.Bank.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	private int ano;
	private String hname;
	private double bal;

}
