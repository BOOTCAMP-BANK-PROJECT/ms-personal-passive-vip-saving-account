package com.bootcamp.personal.passive.vipsavingaccount.service;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccountMovement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalPassiveVipSavingAccountMovementService {
	
    Flux<PersonalPassiveVipSavingAccountMovement> findAll();
    Mono<PersonalPassiveVipSavingAccountMovement> create(PersonalPassiveVipSavingAccountMovement vipm);
    Flux<PersonalPassiveVipSavingAccountMovement> findByDocumentNumber(String num);
    Mono<PersonalPassiveVipSavingAccountMovement> update(PersonalPassiveVipSavingAccountMovement vipm);
    Mono<Void> deleteById(String id);

}
