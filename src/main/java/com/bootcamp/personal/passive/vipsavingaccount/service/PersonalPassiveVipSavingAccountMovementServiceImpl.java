package com.bootcamp.personal.passive.vipsavingaccount.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccountMovement;
import com.bootcamp.personal.passive.vipsavingaccount.repository.PersonalPassiveVipSavingAccountMovementRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PersonalPassiveVipSavingAccountMovementServiceImpl implements PersonalPassiveVipSavingAccountMovementService {
	
	@Autowired
    public final PersonalPassiveVipSavingAccountMovementRepository repo;

	@Override
	public Flux<PersonalPassiveVipSavingAccountMovement> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return repo.deleteById(id);
	}

	@Override
	public Flux<PersonalPassiveVipSavingAccountMovement> findByDocumentNumber(String num) {
		return repo.findByDocumentNumber(num);
	}

	@Override
	public Mono<PersonalPassiveVipSavingAccountMovement> create(PersonalPassiveVipSavingAccountMovement vipm) {
		return repo.save(vipm);
	}

	@Override
	public Mono<PersonalPassiveVipSavingAccountMovement> update(PersonalPassiveVipSavingAccountMovement vipm) {
		return repo.save(vipm);
	}

}
