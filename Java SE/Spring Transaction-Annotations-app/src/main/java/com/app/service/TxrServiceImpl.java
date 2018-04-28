package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Account;
import com.app.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accountRepository;

	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
		// load accounts
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);
		// debit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		// credit
		toAccount.setBalance(toAccount.getBalance() + amount);
		// update
		accountRepository.update(fromAccount);
		boolean b = true;
		//if (b)
			//throw new RuntimeException("txn failed..");
		accountRepository.update(toAccount);
	}

}
