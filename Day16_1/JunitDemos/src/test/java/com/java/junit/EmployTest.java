package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString() {
		Employ emp = new Employ(1, "Satya", Gender.MALE, "Java", "Manager", 99424);
		String result = "Employ [empno=1, name=Satya, gender=MALE, "
				+ "dept=Java, desig=Manager, basic=99424.0]";
		assertEquals(result, emp.toString());
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Satya");
		employ.setGender(Gender.MALE);
		employ.setDept("Java");
		employ.setDesig("Manager");
		employ.setBasic(99424);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Satya", employ.getName());
		assertEquals(Gender.MALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Manager", employ.getDesig());
		assertEquals(99424, employ.getBasic(), 0);
	}
	
	@Test
	public void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ emp = new Employ(1, "Satya", Gender.MALE, "Java", "Manager", 99424);
		
		assertEquals(1, emp.getEmpno());
		assertEquals("Satya", emp.getName());
		assertEquals(Gender.MALE, emp.getGender());
		assertEquals("Java", emp.getDept());
		assertEquals("Manager", emp.getDesig());
		assertEquals(99424, emp.getBasic(),0);
	}

}
