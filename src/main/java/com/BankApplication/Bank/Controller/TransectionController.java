package com.BankApplication.Bank.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.BankApplication.Bank.ResponseEnt.Resp;
import com.BankApplication.Bank.Service.TransectionService;
import com.BankApplication.Bank.TransectionEntity.Transection;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/bank/Transection/api")
public class TransectionController {
	
	@Autowired
	TransectionService ts;
	
	@PostMapping("/deposit")
	public  ResponseEntity<Resp<Double>> deposit(@RequestBody Transection t) {
		int id=t.getId();
		double amt=t.getAmt();
		double rem=ts.deposit(id, amt);
		return new ResponseEntity<>(new Resp<>(200,"deposit sucessfully",rem,LocalDateTime.now()),HttpStatus.OK);
	}
	
	@PostMapping("/withdraw")
	public  ResponseEntity<Resp<Double>> withdraw(@RequestBody Transection t) {
		int id=t.getId();
		double amt=t.getAmt();
		double rem=ts.withdraw(id, amt);
		
		 return new ResponseEntity<>(new Resp<>(200,"withdraw sucessfully",rem,LocalDateTime.now()),HttpStatus.OK);
	}
}
