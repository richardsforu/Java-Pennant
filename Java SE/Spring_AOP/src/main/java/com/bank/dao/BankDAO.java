package com.bank.dao;

import org.springframework.stereotype.Repository;

import com.model.Account;

@Repository
public class BankDAO {

	public Account findByID(String accNo) {

		Account account = new Account();
		account.setAccNO(accNo);
		account.setName("Naga");
		account.setBalance(1000.00);

		return account;

	}
}
