package com.java.bank;

import java.sql.SQLException;

public interface BankDAO {
	String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException;
}
