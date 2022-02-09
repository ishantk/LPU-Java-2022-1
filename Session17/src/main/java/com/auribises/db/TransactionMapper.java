package com.auribises.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auribises.bean.Transaction;

public class TransactionMapper implements RowMapper<Transaction>{
	
	public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		Transaction transaction = new Transaction();
		transaction.tid = rs.getInt(1);
		transaction.userEmail = rs.getString(2);
		transaction.amount = rs.getInt(3);
		transaction.dateTimeStamp = rs.getString(4);
		return transaction;
	}

}
