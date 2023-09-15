package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployShowServlet
 */
public class EmployShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		EmployDAO dao = new EmployDAOImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			for (Employ employ : employList) {
				out.println("Employ No   " +employ.getEmpno() + "<br/>");
				out.println("Employ Name  " +employ.getName() + "<br/>");
				out.println("Gender  " +employ.getGender() + "<br/>");
				out.println("Department  " +employ.getDept() + "<br/>");
				out.println("Designation  " +employ.getDesig() + "<br/>");
				out.println("Salary  " +employ.getBasic() + "<br/>");
				out.println("----------------------------------------<br/>");
			}
		} catch (ClassNotFoundException | SQLException e) {
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
