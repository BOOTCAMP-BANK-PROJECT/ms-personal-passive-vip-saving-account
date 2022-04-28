package com.bootcamp.personal.passive.vipsavingaccount.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccount;

import reactor.core.publisher.Mono;

public interface PersonalPassiveVipSavingAccountRepository extends ReactiveCrudRepository<PersonalPassiveVipSavingAccount, String> {
	
	Mono<PersonalPassiveVipSavingAccount> findByDocumentNumber(String num);

}
