package com.java.jsf;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl {

	SessionFactory sf;
	Session session;
	private String localCode;
	
	public String getLocalCode() {
		return localCode;
	}
	
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public String validateMe(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		Map<String,Object> sessionMap = 
	FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", encr.trim()));
		cr.setProjection(Projections.rowCount());
		long  count =(Long)cr.uniqueResult();
		if (count==1) {
			return "ShowDept.xhtml?faces-redirect=true";			
		} else {
			sessionMap.put("errorMessage", "Invalid Credentials...");
			return "Login.xhtml?faces-redirect=true";
		}
	}

	
	public void employLocaleCodeChanged(ValueChangeEvent e){
		//assign new value to localeCode
		this.localCode = e.getNewValue().toString();
		System.out.println(this.localCode);
	}
	
	public List<Employ> showEmployDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}
	public List<String> getDepartments() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.distinct(Projections.property("dept")); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}
	public List<Employ> getEmployListByDept(String dept) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		List<Employ> employList = cr.list();
		return employList;
	}
	
	public List<String> getNames() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.property("name"); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}
}
