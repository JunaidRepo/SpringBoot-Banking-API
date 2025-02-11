package com.BankApplication.Bank.ExceptionHandling;


import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.IdNotPresent;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.IdPresent;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.AccountExceptions.updatebal;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.Overlimit;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.lessamt;
import com.BankApplication.Bank.ExceptionHandling.Exceptions.TreansectionException.udervalue;
import com.BankApplication.Bank.ResponseEnt.Resp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class Handler {

    @ExceptionHandler()
    public ResponseEntity<Resp<String>> notpresent(IdNotPresent e){
        return new ResponseEntity<>(new Resp<>(404,"no data was present",e.getMessage(), LocalDateTime.now()),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler()
    public ResponseEntity<Resp<String>> present(IdPresent e){
        return new ResponseEntity<>(new Resp<>(409,"data was present",e.getMessage(), LocalDateTime.now()),HttpStatus.CONFLICT);
    }
    
    
    @ExceptionHandler()
    public ResponseEntity<Resp<String>> lessamt(lessamt e){
        return new ResponseEntity<>(new Resp<>(404,"",e.getMessage(), LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler()
    public ResponseEntity<Resp<String>> moreamt(Overlimit e){
        return new ResponseEntity<>(new Resp<>(404,"",e.getMessage(), LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler()
    public ResponseEntity<Resp<String>> moreamt(udervalue e){
        return new ResponseEntity<>(new Resp<>(404,"",e.getMessage(), LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler()
    public ResponseEntity<Resp<String>> updatebal(updatebal e){
        return new ResponseEntity<>(new Resp<>(404,"",e.getMessage(), LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }

}
