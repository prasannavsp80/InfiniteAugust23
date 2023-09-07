package com.java.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAOImpl implements BankDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = BankConnectionHelper.getConnection();
		String cmd = "Select Case when max(AccountNo) IS NULL THEN "
				+ " 1 else max(accountNo)+1 end accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	@Override
	public String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException {
		int id = generateAccountNo();
		bank.setAccountNo(id);
		connection = BankConnectionHelper.getConnection();
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, "
		+ " state, amount, cheqFacil, AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bank.getAccountNo());
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account created with Account No " +id;
	}

}
