package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl  {

	PreparedStatement pst;
	Connection connection;
	
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
        String cmd = "Insert into Employ(Empno,name,gender,dept,desig,basic) "
         		+ " values(?,?,?,?,?,?)";
         PreparedStatement pst = connection.prepareStatement(cmd);
         pst.setInt(1, employ.getEmpno());
         pst.setString(2, employ.getName());
         pst.setString(3, employ.getGender().toString());
         pst.setString(4, employ.getDept());
         pst.setString(5, employ.getDesig());
         pst.setDouble(6, employ.getBasic());
         pst.executeUpdate();
         return "Employ Record Inserted...";

	}
	
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;

	}
	
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;

	}
}
