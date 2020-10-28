package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.Account;

public interface AccountService {
    Account findAccountByUsernameAndPassword(String username, String password);
}
