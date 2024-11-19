package com.example.testspring1.controller;

import com.example.testspring1.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("accounts")
    public Object getAllAccounts() {
        return accountRepository.findAll();
    }
}
