package com.java.hib;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class LoginDAOImpl implements LoginDAO {

	SessionFactory sf;
	Session session;
	
	@Override
	public String addUser(Login login) {
		sf = SessionHelper.getConnection();
		session =sf.openSession();
		Transaction tran = session.beginTransaction();
		session.save(login);
		tran.commit();
		return "User Added...";
	}

	@Override
	public Login authenticate(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String pwd = EncryptPassword.getCode(login.getPassCode());
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", pwd));
		Login res =(Login) cr.uniqueResult();
		return res;
	}

	@Override
	public long loginValidate(Login login) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		String pwd = EncryptPassword.getCode(login.getPassCode());
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", pwd));
		cr.setProjection(Projections.rowCount());
		long  count =(Long)cr.uniqueResult();
		return count;
	}

}
