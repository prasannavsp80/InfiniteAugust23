package com.java.bank;

import java.sql.SQLException;

public interface BankDAO {
	String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchAccountDao(int accountNo) throws ClassNotFoundException, SQLException;
	String closeAccountDao(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccountDao(int accountNo, int depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccountDao(int accountNo, int withdrawAmount) throws ClassNotFoundException, SQLException;
}
