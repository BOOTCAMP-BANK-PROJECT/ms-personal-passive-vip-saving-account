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

import com.bootcamp.personal.passive.vipsavingaccount.entity.PersonalPassiveVipSavingAccountMovement;
import com.bootcamp.personal.passive.vipsavingaccount.service.PersonalPassiveVipSavingAccountMovementServiceImpl;

@RestController
@RequestMapping("enterprise/passive/pyme_current_account")
@Tag(name = "Personal Passive Vip Saving Account Movement Type", description = "Personal Passive Vip Saving Account Movement type")
@CrossOrigin( value = { "*" })
@RequiredArgsConstructor
public class PersonalPassiveVipSavingAccountMovementController {
	
	@Autowired
    public final PersonalPassiveVipSavingAccountMovementServiceImpl service;

    @GetMapping
    public Flux<PersonalPassiveVipSavingAccountMovement> getAll() {
        return service.findAll();
    }
    
    @GetMapping("/find/{num}")
    public Flux<PersonalPassiveVipSavingAccountMovement> findByNum(@PathVariable String num){
    	return service.findByDocumentNumber(num);
    }
    
    @PostMapping
    public Mono<PersonalPassiveVipSavingAccountMovement> create(@RequestBody PersonalPassiveVipSavingAccountMovement p) {
        return service.create(p);
    }

    @PutMapping("/update/{id}")
    public Mono<PersonalPassiveVipSavingAccountMovement> update(@RequestBody PersonalPassiveVipSavingAccountMovement p, @PathVariable String id) {
        return service.update(p);
    }
    
    @DeleteMapping("/deleteById/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }

}