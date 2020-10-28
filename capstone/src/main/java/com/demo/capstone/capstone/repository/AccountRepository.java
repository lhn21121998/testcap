package com.demo.capstone.capstone.repository;

import com.demo.capstone.capstone.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findAccountByUsernameAndPassword(String username, String password);
}
