package com.java.inf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDetails {

	public static void main(String[] args) {
		SessionFactory factory= 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
	    Transaction t=session.beginTransaction(); 
		
	    Employee e1=new Employee();  
	    e1.setEmployeeId(100);
	    e1.setName("Prasanna");  
	    e1.setEmail("prasanna.trainer@gmail.com");  
	    session.save(e1);
	      
	    Address address1=new Address();  
	    address1.setAddressLine1("37-115/3, Sree Colony");  
	    address1.setCity("Hyderabad");  
	    address1.setState("TS");  
	    address1.setCountry("India");  
	    address1.setPincode(500046);  
	    e1.setAddress(address1);  
	    address1.setEmployee(e1);  
	    session.save(address1);
	   // session.save(e1);  
	    t.commit();  
	      
	    session.close();  
	    System.out.println("success");
	}
}
