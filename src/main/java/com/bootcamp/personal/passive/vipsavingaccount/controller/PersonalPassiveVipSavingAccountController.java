package com.bootcamp.personal.passive.vipsavingaccount.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccount;
import com.bootcamp.personal.passive.vipsavingaccount.service.PersonalPassiveVipSavingAccountServiceImpl;

@RestController
@RequestMapping("enterprise/passive/pyme_current_account")
@Tag(name = "Personal Passive Saving Account Type", description = "Manage Personal Passive Saving Account type")
@CrossOrigin( value = { "*" })
@RequiredArgsConstructor
public class PersonalPassiveVipSavingAccountController {
	
	@Autowired
    public final PersonalPassiveVipSavingAccountServiceImpl service;

    @GetMapping
    public Flux<PersonalPassiveVipSavingAccount> getAll() {
        return service.findAll();
    }
    
    @GetMapping("/find/{num}")
    public Mono<PersonalPassiveVipSavingAccount> findByNum(@PathVariable String num){
    	return service.findByDocumentNumber(num);
    }
    
    @PostMapping
    public Mono<PersonalPassiveVipSavingAccount> create(@RequestBody PersonalPassiveVipSavingAccount p) {
        return service.create(p);
    }

    @PutMapping("/update/{id}")
    public Mono<PersonalPassiveVipSavingAccount> update(@RequestBody PersonalPassiveVipSavingAccount p, @PathVariable String id) {
        return service.update(p);
    }
    
    @DeleteMapping("/deleteById/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }

}