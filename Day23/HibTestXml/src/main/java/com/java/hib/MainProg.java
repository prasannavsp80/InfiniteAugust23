package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		org.hibernate.Session s=sf.openSession();
		Query query = s.createQuery("from Employ");
		List<Employ> employList = query.list();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
