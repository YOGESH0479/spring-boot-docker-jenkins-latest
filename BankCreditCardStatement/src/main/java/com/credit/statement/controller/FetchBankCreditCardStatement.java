package com.credit.statement.controller;

import com.credit.statement.entity.CreditCardRecord;
import com.credit.statement.service.ICreditCardStmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/get")
public class FetchBankCreditCardStatement {
    @Autowired
    ICreditCardStmtService creditCardStmtServiceImpl;

    @GetMapping("/statement")
    public ResponseEntity<?> getCreditCardStatement(){
        try{
            List<CreditCardRecord> listOfStmt=creditCardStmtServiceImpl.getCreditCardStatement();
            return new ResponseEntity<List<CreditCardRecord>>(listOfStmt, HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
