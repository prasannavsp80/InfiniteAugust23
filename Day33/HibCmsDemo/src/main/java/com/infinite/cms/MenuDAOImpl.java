package com.infinite.cms;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

@ManagedBean(name="menuDao")
@SessionScoped
public class MenuDAOImpl implements MenuDAO {

	private String localCode;
	
	private int menuId;
	
	

	public int getMenuId() {
		return menuId;
	}
	
	private double price;
	
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	@Override
	public List<Menu> showMenuByRestaurant(int rid) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("restaurantId", rid));
		List<Menu> menuList = cr.list();
		return menuList;
	}

	public Integer searchByMenuDao(String itemName) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("menuItem", itemName));

		Projection projection = Projections.property("menuId"); 
		cr.setProjection(projection); 
		Integer rid = (Integer)cr.uniqueResult();
		System.out.println("method " +rid);
		return rid;
	}
	
	public Menu searchByMenuId(int menuId) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("menuId", menuId));
		Menu menu = (Menu)cr.uniqueResult();
//		System.out.println(menu);
		return menu;
	}

	public void menuLocaleCodeChanged(ValueChangeEvent e){
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		String rname = e.getNewValue().toString();
		Integer rid = searchByMenuDao(rname);
		this.menuId = rid;
		this.localCode=rname;
		Menu menu = searchByMenuId(this.menuId);
		System.out.println("Menu  " +menu);
		sessionMap.put("menu", menu);
		System.out.println(menu.getMenuPrice());
		this.setPrice(menu.getMenuPrice());
		sessionMap.put("price", menu.getMenuPrice());
	}


	public List<String> showMenuItemNames(int rid) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("restaurantId", rid));
		Projection projection = Projections.property("menuItem");
		cr.setProjection(projection);
		List<String> menuList = cr.list();
		return menuList;
	}
}
