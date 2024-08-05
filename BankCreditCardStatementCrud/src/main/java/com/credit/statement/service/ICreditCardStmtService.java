package com.credit.statement.service;

import com.credit.statement.entity.CreditCardRecord;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface ICreditCardStmtService {
//    List<CreditCardRecord> getCreditCardStatement(Date date1, Date date2);
      List<CreditCardRecord> getCreditCardStatement();
}
