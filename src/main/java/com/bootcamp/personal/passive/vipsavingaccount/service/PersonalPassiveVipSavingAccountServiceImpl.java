package com.bootcamp.personal.passive.vipsavingaccount.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccount;
import com.bootcamp.personal.passive.vipsavingaccount.repository.PersonalPassiveVipSavingAccountRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PersonalPassiveVipSavingAccountServiceImpl implements PersonalPassiveVipSavingAccountService {
	
	@Autowired
    public final PersonalPassiveVipSavingAccountRepository repo;

	@Override
	public Flux<PersonalPassiveVipSavingAccount> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return repo.deleteById(id);
	}

	@Override
	public Mono<PersonalPassiveVipSavingAccount> findByDocumentNumber(String num) {
		return repo.findByDocumentNumber(num);
	}

	@Override
	public Mono<PersonalPassiveVipSavingAccount> create(PersonalPassiveVipSavingAccount vips) {
		return repo.save(vips);
	}

	@Override
	public Mono<PersonalPassiveVipSavingAccount> update(PersonalPassiveVipSavingAccount vips) {
		return repo.save(vips);
	}

}
