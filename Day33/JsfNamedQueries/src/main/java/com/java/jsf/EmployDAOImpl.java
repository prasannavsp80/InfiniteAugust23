package com.java.jsf;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;

public class EmployDAOImpl implements EmployDAO {

	Session session;
	@Override
	public List<Employ> showEmployDao() {
		session = SessionHelper.getConnection().openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public String searchEmployDao(int empno) {
		Map<String,Object> sessionMap = 
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session = SessionHelper.getConnection().openSession();
		Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno",empno);   
		Employ employ = (Employ)query.uniqueResult();
		sessionMap.put("employFound", employ);
		return "SearchEmploy.jsp?faces-redirect=true";
	}

	@Override
	public String validate(Login login) {
		Map<String,Object> sessionMap = 
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session = SessionHelper.getConnection().openSession();
		Query query = session.getNamedQuery("authenticate");
		String encr = EncryptPassword.getCode(login.getPassCode());
		query.setParameter("userName",login.getUserName());
		query.setParameter("passCode",encr);
		Login loginFound = (Login)query.uniqueResult();
		if (loginFound!=null) {
			return "EmployShow.jsp?faces-redirect=true";
		} else {
			sessionMap.put("error", "Invalid Credentials...");
			return "Login.jsp?faces-redirect=true";
		}
	}

}
