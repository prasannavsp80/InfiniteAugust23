package com.java.reg;

import java.sql.SQLException;

public interface AccounsDAO {

	String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException;
}
