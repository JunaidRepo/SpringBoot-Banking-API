package com.BankApplication.Bank.Repository;

import com.BankApplication.Bank.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
