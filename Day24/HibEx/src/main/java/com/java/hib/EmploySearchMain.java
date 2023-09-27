package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf  = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if (employList.size() > 0) {
			Employ employ = employList.get(0);
			System.out.println(employ);
		}
		else {
			System.out.println("*** Record not found ***");
		}
	}
}
