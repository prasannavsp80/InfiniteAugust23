package com.java.rms;

import java.sql.Date;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.Query;

public class OrdersDaoImpl implements OrdersDAO{
	
	SessionFactory sf;
	Session session;
	
	@Override
	public String placeOrderDao(Orders order) {
		java.util.Date utilDate = new java.util.Date();
		Date currentDate = new Date(utilDate.getTime());
		
		Map<String, Object> sessionMap =
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		int custId = (int) sessionMap.get("customerId");
		int venId = (int) sessionMap.get("venId");
		int menuId = (int) sessionMap.get("menuId");
		double price = (Double) sessionMap.get("billAmount");
		double billAmount = price * order.getOrdquantity();
		System.out.println(billAmount);
		String payType = (String) sessionMap.get("payType");
		WalletSource ws = WalletSource.valueOf(payType);
		double walletAmount = new CustomerDaoImpl().purseValue(payType);
		if (walletAmount - billAmount > 0) {
			order.setCusid(custId);
			order.setVenid(venId);
			order.setWalsource(payType);
			order.setMenid(menuId);
			order.setOrdbillamount(billAmount);
			order.setOrdstatus(Ordstatus.PENDING);
			order.setOrddate(currentDate);
			System.out.println(order);
			double balance = walletAmount - billAmount;
			
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.save(order);
			trans.commit();
			session.close();
			session = SessionHelper.getConnection().openSession();
			String q = "from Wallet where custId = " +custId + " AND walletSource = '" +ws +"'";
			System.out.println(q);
			Query query = session.createQuery(q);
			
			Wallet wallet = (Wallet)query.list().get(0);
			trans = session.beginTransaction(); 
			wallet.setWalletAmount(balance); 
			session.update(wallet);
			trans.commit();
			return "Dashboard.jsp?faces-redirect=true";
		} else {
			return "Message.jsp?faces-redirect=true";
		}
	
	}

}
