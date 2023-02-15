package com.example.springpostgres.logic;

import com.example.springpostgres.dao.AccountRepository;
import com.example.springpostgres.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountLogic {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public List<Account> getConditionalAccount(Integer userId){
        return accountRepository.findAllWithFilteredUserId(userId);
    }

}
