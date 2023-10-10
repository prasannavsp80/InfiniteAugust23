package com.infinite.cms;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

@ManagedBean(name="vDao")
@SessionScoped
public class VendorDAOImpl implements VendorDAO {

	private String localCode;
	private int vid;
	
	
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	@Override
	public List<String> showVendorNamesDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Vendor.class);
		Projection projection = Projections.property("venName"); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}

	@Override
	public Vendor searchByVendorNameDao(String name) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Vendor.class);
		cr.add(Restrictions.eq("venName", name));
		Vendor vendor = (Vendor)cr.uniqueResult();
		return vendor;
	}

	public void restaurantLocaleCodeChanged(ValueChangeEvent e){
		String rname = e.getNewValue().toString();
		System.out.println(" name Vendor  " +rname);
		Vendor vendor = searchByVendorNameDao(rname);
		this.setVid(vendor.getVenId());
		System.out.println("Vendor Id  " +this.getVid());
	}

	public void vendorLocaleCodeChanged(ValueChangeEvent e){
		String rname = e.getNewValue().toString();
		System.out.println(rname);
	}


}
