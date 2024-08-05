package com.credit.statement.repository;

import com.credit.statement.entity.CreditCardRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface ICreditCardStatementRepository extends JpaRepository<CreditCardRecord,Integer> {
//    @Query("FROM CreditCardRecord WHERE  BETWEEN startDate=?1 AND endDate=?2")
//    List<CreditCardRecord> getCreditCardStatement(Date startDate,Date endDate);
}


