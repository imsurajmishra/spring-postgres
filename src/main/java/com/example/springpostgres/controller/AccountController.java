package com.example.springpostgres.controller;

import com.example.springpostgres.entity.Account;
import com.example.springpostgres.logic.AccountLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountLogic accountLogic;

    @GetMapping()
    @ResponseBody()
    public List<Account> account(){
        return accountLogic.getAccounts();
    }

    @GetMapping("/filter")
    @ResponseBody()
    public List<Account> accountWithCondition(@RequestParam Integer userId){
        return accountLogic.getConditionalAccount(userId);
    }

}
