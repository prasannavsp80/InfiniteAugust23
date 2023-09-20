package com.java.reg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountsDAOImpl implements AccounsDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1 else "
				+ " Max(AccountNo)+1 end accno from Accounts";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	@Override
	public String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		int accno = generateAccountNo();
		accounts.setAccountNo(accno);
		String cmd = "Insert into Accounts(AccountNo, FirstName, LastName, City, State, "
				+ "Amount, CheqFacil, AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accounts.getAccountNo());
		pst.setString(2, accounts.getFirstName());
		pst.setString(3, accounts.getLastName());
		pst.setString(4, accounts.getCity());
		pst.setString(5, accounts.getState());
		pst.setDouble(6, accounts.getAmount());
		pst.setString(7, accounts.getCheqFacil());
		pst.setString(8, accounts.getAccountType());
		pst.executeUpdate();
		return "Account Created...";
	}

}
