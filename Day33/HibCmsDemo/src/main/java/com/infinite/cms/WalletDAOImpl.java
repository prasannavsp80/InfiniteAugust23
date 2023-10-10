package com.infinite.cms;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

@ManagedBean(name="wdao")
@SessionScoped
public class WalletDAOImpl implements WalletDAO {

	private String localCode;
	
	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	@Override
	public List<Wallet> showCustomerWalletDao(int custId) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Wallet.class);
		cr.add(Restrictions.eq("custId", custId));
		List<Wallet> walletList = cr.list();
		return walletList;
	}

	@Override
	public List<String> showCustomerWalletNames(int custId) {
		System.out.println("Wallet Customer Id  " +custId);
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Wallet.class);
		cr.add(Restrictions.eq("custId", custId));
		Projection projection = Projections.property("walletSource"); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		System.out.println("Wallets  " +list);
		return list;
	}

	public void restaurantLocaleCodeChanged(ValueChangeEvent e){
		String rname = e.getNewValue().toString();
		System.out.println(" Wallet Selected is   " +rname);
		this.localCode = rname;
	}

	@Override
	public Wallet showCustomerBalanceDao(int custId, String walletName) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Wallet.class);
		cr.add(Restrictions.eq("custId", custId));
		cr.add(Restrictions.eq("walletSource",WalletSource.valueOf(walletName)));
		Wallet wallet = (Wallet)cr.uniqueResult();
		return wallet;
	}

}
