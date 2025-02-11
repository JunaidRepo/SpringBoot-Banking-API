package com.BankApplication.Bank.Controller;


import com.BankApplication.Bank.DTO.AccountDto;
import com.BankApplication.Bank.ResponseEnt.Resp;
import com.BankApplication.Bank.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/bank/Account/api")
public class AccountController {

    @Autowired
    AccountService accser;

    @PostMapping("/ins")
    public ResponseEntity<Resp<AccountDto>> insert(@RequestBody AccountDto acc){
        AccountDto t=accser.insert(acc);
        return new ResponseEntity<>(new Resp<>(200,"inserted sucessfully",t,LocalDateTime.now()),HttpStatus.OK);
    }

    @PutMapping("/upd")
    public ResponseEntity<Resp<AccountDto>> update(@RequestBody AccountDto acc){
        AccountDto t=accser.update(acc);
        return new ResponseEntity<>(new Resp<>(200,"Updated sucessfully",t,LocalDateTime.now()),HttpStatus.OK);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Resp<AccountDto>> delete(@PathVariable int id){
        accser.delete(id);
        return new ResponseEntity<>(new Resp<>(200,"Deleted sucessfully",null,LocalDateTime.now()),HttpStatus.OK);
    }
    @GetMapping("/sel")
    public ResponseEntity<Resp<List<AccountDto>>> select(){

        return new ResponseEntity<>(new Resp<>(200,"selected sucessfully",accser.getAll(),LocalDateTime.now()),HttpStatus.OK);
    }

}
