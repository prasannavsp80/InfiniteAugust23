package com.java.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataTest { 

	static Data obj;
	
	@BeforeClass
	public static void setUp() {
		obj = new Data();
		System.out.println("Object Created...");
	}
	@Before
	public void showMessage() {
		System.out.println("Test Case Execution Started...");
	}
	
	@After
	public void endNotes() {
		System.out.println("Test Case Execution Ended...");
	}
	
	@AfterClass
	public static void cleanUp() {
		obj = null;
		System.out.println("Resource Deallocated...");
	}
	@Test
	public void testEvenOdd() {
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
	}
	
	@Test
	public void testMapEx() {
		assertNotNull(obj.mapEx("Ganesh"));
		assertNull(obj.mapEx("Sonali"));
	}
	@Test
	public void testNull() {
		Data data = null;
		assertNull(data);
	}
	
	@Test
	public void testArray() {
		int[] a= new int[] {1,2,3,4,5};
		int[] b= new int[] {1,2,3,4,5};
		assertArrayEquals(a, b);
	}
	@Test
	public void testMax3() {
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(3, 2, 5));
	}
	
	@Test
	public void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Welcome to Junit Programming..." , obj.sayHello());
	}
}
