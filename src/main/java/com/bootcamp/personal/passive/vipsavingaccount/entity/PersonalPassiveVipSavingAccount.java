package com.bootcamp.personal.passive.vipsavingaccount.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PersonalPassiveVipSavingAccount {
	
	@Id
	private String id;
	private String accountNumber; //"001207420200355458"
    private PersonalClient documentNumber;
    private String createDate;
    private String avgAmountDaily;
    
}
