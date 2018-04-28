package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.app.model.Account;

@Repository("accRepo")
public class AccountRepositoryImpl implements AccountRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Account load(String num) {
		String sql = "select * from ACCOUNTS where num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {
			public Account mapRow(ResultSet rs, int r) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString(1));
				account.setHolderName(rs.getString(2));
				account.setBalance(rs.getDouble(3));
				return account;
			}
		}, num);
	}

	public void update(Account account) {
		String sql="update ACCOUNTS set balance=? where num=?";
		jdbcTemplate.update(sql, account.getBalance(),account.getNum());
	}

}
