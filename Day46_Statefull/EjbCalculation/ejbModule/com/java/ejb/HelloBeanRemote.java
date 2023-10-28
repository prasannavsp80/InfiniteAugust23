package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloBeanRemote {

	String sayHello();
	String greeting();
}
