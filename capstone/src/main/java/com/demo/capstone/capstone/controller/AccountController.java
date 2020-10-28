package com.demo.capstone.capstone.controller;

import com.demo.capstone.capstone.entity.Account;
import com.demo.capstone.capstone.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("login")
    public boolean checkLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        try {
            Account account = accountService.findAccountByUsernameAndPassword(username, password);
            if(account!=null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
