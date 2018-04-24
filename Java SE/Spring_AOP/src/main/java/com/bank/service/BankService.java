package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDAO;
import com.model.Account;

@Service
public class BankService {

	private BankDAO bankDAO;

	@Autowired
	public void setBankDAO(BankDAO bankDAO) {
		this.bankDAO = bankDAO;
	}

	public void bankService() {

		String accNo = "12345";
		Account account = bankDAO.findByID(accNo);
		double balance = account.getBalance();
		System.out.println("Balance : " + balance);

	}

}
