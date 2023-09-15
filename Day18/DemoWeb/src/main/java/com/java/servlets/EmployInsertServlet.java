package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployInsertServlet
 */
public class EmployInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("empName"));
		employ.setGender(Gender.valueOf(request.getParameter("gender")));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
		
		PrintWriter out = response.getWriter();
		EmployDAO dao = new EmployDAOImpl();
		try {
			out.println(dao.addEmployDao(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
