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


public class RestaurantDaoImpl implements RestaurantDAO{

	SessionFactory sf;
	Session session;
	
	private int resId;
	
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}

	private String localCode;
	private String localCode1;
	
	
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public String getLocalCode1() {
		return localCode1;
	}
	public void setLocalCode1(String localCode1) {
		this.localCode1 = localCode1;
	}
	
	private String menuCode;
	
	
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public void restaurantLocaleCodeChanged(ValueChangeEvent e){
		this.localCode = e.getNewValue().toString();
		this.resId = getRestaurantId(localCode);
		Map<String, Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("rname", this.localCode);
		sessionMap.put("restId", this.resId);
		
	}
	

//	@Override
//	public String showRestaurantsDao() {
//		Map<String, Object> sessionMap =
//				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
//		sf = SessionHelper.getConnection();
//		session = sf.openSession();
//		Criteria criteria = session.createCriteria(Restaurant.class);
//		List<Restaurant> restaurantsList = criteria.list();
//		sessionMap.put("restaurantsList", restaurantsList);
//		return "ShowRestaurant.jsp?faces-redirect=true";
//	}
	
	public List<String> showRestaurantNames() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Restaurant.class);
		Projection projection = Projections.property("Restaurant_Name");
		criteria.setProjection(projection);
		List<String> RestaurantNames = criteria.list();
		return RestaurantNames;
	}
	public int getRestaurantId(String Restaurant_Name) {
		System.out.println("Rname " +Restaurant_Name);
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Restaurant.class);
		criteria.add(Restrictions.eq("Restaurant_Name", Restaurant_Name));
		System.out.println("Rname " +Restaurant_Name);
		Restaurant restaurant = (Restaurant) criteria.uniqueResult();
		System.out.println("RID from Change is " +restaurant.getRestaurant_ID());
		return restaurant.getRestaurant_ID();
	}
	
	public List<String> showMenuNames() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		System.out.println(resId);
		criteria.add(Restrictions.eq("restaurantid", getResId()));
		
		Projection projection = Projections.property("menitem");
		criteria.setProjection(projection);
		List<String> menutList = criteria.list();
		System.out.println(menutList);
		return menutList;
	}
	

	
	
	
	@Override
	public List<Restaurant> showRestaurantsDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Restaurant.class);
		List<Restaurant> restaurantsList = criteria.list();
		return restaurantsList;
	}

}
