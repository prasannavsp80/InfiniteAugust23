package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class HelloBean
 */
@Stateful
@Remote(HelloBeanRemote.class)
public class HelloBean implements HelloBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to EJB Programming...";
	}

	@Override
	public String company() {
		// TODO Auto-generated method stub
		return "From Infinite Company...";
	}

}
