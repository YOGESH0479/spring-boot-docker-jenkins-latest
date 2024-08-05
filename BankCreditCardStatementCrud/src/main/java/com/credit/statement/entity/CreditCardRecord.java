package com.credit.statement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "creditcardstatementrecord")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardRecord {
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Id
    Integer transaction_id;
    @Column
    Date txn_date;
    @Column
    Double amount;
    @Column
    String bank_name;
}
