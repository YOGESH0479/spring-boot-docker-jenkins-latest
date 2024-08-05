package com.credit.statement.service;

import com.credit.statement.entity.CreditCardRecord;
import com.credit.statement.repository.ICreditCardStatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CreditCardStmtServiceImpl implements ICreditCardStmtService{
    @Autowired
    ICreditCardStatementRepository ICreditCardStatementRepository;

    @Override
    public List<CreditCardRecord> getCreditCardStatement() {
        return ICreditCardStatementRepository.findAll();
    }

    //   @Override
//    public List<CreditCardRecord> getCreditCardStatement(Date date1, Date date2) {
//        return ICreditCardStatementRepository.getCreditCardStatement(date1,date2);
//    }

}
