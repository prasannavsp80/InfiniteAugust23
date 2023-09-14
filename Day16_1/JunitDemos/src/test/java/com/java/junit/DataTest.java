package com.java.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {

	@Test
	public void testEvenOdd() {
		Data obj = new Data();
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
	}
	
	@Test
	public void testMapEx() {
		Data data = new Data();
		assertNotNull(data.mapEx("Ganesh"));
		assertNull(data.mapEx("Sonali"));
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
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(3, 2, 5));
	}
	
	@Test
	public void testSum() {
		Data obj = new Data();
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to Junit Programming..." , obj.sayHello());
	}
}
