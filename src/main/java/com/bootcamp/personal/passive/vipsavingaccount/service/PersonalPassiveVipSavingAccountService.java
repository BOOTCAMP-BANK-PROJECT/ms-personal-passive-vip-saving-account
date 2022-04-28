package com.bootcamp.personal.passive.vipsavingaccount.service;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalPassiveVipSavingAccountService {
	
    Flux<PersonalPassiveVipSavingAccount> findAll();
    Mono<PersonalPassiveVipSavingAccount> create(PersonalPassiveVipSavingAccount vips);
    Mono<PersonalPassiveVipSavingAccount> findByDocumentNumber(String num);
    Mono<PersonalPassiveVipSavingAccount> update(PersonalPassiveVipSavingAccount vips);
    Mono<Void> deleteById(String id);

}
