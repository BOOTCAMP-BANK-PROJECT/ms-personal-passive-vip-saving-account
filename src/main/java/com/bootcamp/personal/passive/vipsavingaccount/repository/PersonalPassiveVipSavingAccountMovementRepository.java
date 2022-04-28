package com.bootcamp.personal.passive.vipsavingaccount.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccountMovement;

import reactor.core.publisher.Flux;

public interface PersonalPassiveVipSavingAccountMovementRepository extends ReactiveCrudRepository<PersonalPassiveVipSavingAccountMovement, String> {
	
	Flux<PersonalPassiveVipSavingAccountMovement> findByDocumentNumber(String num);

}
