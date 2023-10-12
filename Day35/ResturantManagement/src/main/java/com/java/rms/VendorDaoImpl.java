package com.java.rms;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class VendorDaoImpl implements VenderDAO{
	
	SessionFactory sessionFactory;
	Session session;
	
	private String localCode;
	private int venId;
	
	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public List<Vendor> showVendorDao() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Vendor.class);
		List<Vendor> vendorList = criteria.list();
		System.out.println(vendorList);
		return vendorList;
	}
	
	public int getVendorId(String vendorName) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Vendor.class);
		criteria.add(Restrictions.eq("venname", vendorName));
		Vendor vendor = (Vendor) criteria.uniqueResult();
		return vendor.getVenid();
	}
	public void employLocaleCodeChanged(ValueChangeEvent e){
		//assign new value to localeCode
		this.localCode = e.getNewValue().toString();
		this.venId = getVendorId(localCode);
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("venName", this.localCode);
		sessionMap.put("venId", venId);
	}
	public List<String> showVendorNames() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Vendor.class);
		Projection projection = Projections.property("venname"); 
		criteria.setProjection(projection); 
		List<String> list = criteria.list();
		System.out.println(list);
		return list;
	}
}
