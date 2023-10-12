package com.java.rms;

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


public class MenuDaoImpl implements MenuDAO{

	SessionFactory sf;
	Session session;
	
	private int menuId;
	
    public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Override
	public String showMenuDao(int restaurantid, int pageIndex) {
		sf = SessionHelper.getConnection();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("restaurantid", restaurantid));
		List<Menu> menuList = criteria.list();
		sessionMap.put("menuList", menuList);
		return "ShowMenu.jsp?faces-redirect=true";
	}

	public String showMenuDaoNew(int restaurantid) {
		sf = SessionHelper.getConnection();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		criteria.add(Restrictions.eq("restaurantid", restaurantid));
		List<Menu> menuList = criteria.list();
		sessionMap.put("menuList", menuList);
		return "ShowMenu.jsp?faces-redirect=true";
	}
	
	private String localCode;

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public Integer searchByMenuDao(String itemName) {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();	
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("menitem", itemName));

		Projection projection = Projections.property("menid"); 
		cr.setProjection(projection); 
		Integer menuid = (Integer)cr.uniqueResult();
		System.out.println("method " +menuid);
		sessionMap.put("menuId", menuid);
		return menuid;
	}
	
	public Menu searchByMenuId(int menuId) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("menid", menuId));
		Menu menu = (Menu)cr.uniqueResult();
//		System.out.println(menu);
		return menu;
	}
	public List<String> showMenuNames() {
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		int rid = (Integer)sessionMap.get("restId");
		System.out.println("Menu Rid  " +rid);
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Menu.class);
		System.out.println(rid);
		criteria.add(Restrictions.eq("restaurantid", rid));
		
		Projection projection = Projections.property("menitem");
		criteria.setProjection(projection);
		List<String> menutList = criteria.list();
		System.out.println("Selected Menu List " +rid + " Menu List" +menutList);
		return menutList;
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
		sessionMap.put("billAmount", menu.getMenprice());
		System.out.println(menu.getMenprice());
	//	this.setPrice(menu.getMenprice());
	//	sessionMap.put("price", menu.getMenuPrice());
	}
	public void menuLocaleCodeChangedNew(ValueChangeEvent e){
		this.localCode = e.getNewValue().toString();
	}
}
