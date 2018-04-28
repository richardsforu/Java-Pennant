package com.app.repository;

import com.app.model.Account;

public interface AccountRepository {
	Account load(String num);
	void update(Account account);
}
