package com.hcl.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator cal;
	
	@BeforeAll
	public static void beforeAll() {
		
		System.out.println("BeforeAll executed..");
		cal = new Calculator();
		
	}
	
	@AfterAll
	public static void afterAll() {
		
		System.out.println("After all executed");
		
	}
	
	
	@BeforeEach
	public  void beforeEach() {
		
		
		System.out.println("before..each");
		
	}
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("after..each");
		
	}
	
	
	
	
	@Test
	@DisplayName("AddTest")
	@RepeatedTest(3)
	void testAdd() {
		
	
		
	int actual =	cal.add(5, 5);
		
		assertEquals(10, actual);
		
		System.out.println("add executed..");
		
	}

	@Test
	@DisplayName("TestSub")
	void testSub() {
		
		
		
		int actual =	cal.sub(15, 5);
		
		assertTrue(actual > 0);
		
		System.out.println("sub executed..");
		
	}

	@Test
	@Disabled
	void testMul() {
		
		
		int res = cal.mul(3, 5);
		
		assertNotEquals(9, res);
		System.out.println("mul executed..");
		
	}

	@Test
	void testDiv() {
		
		assertNotNull(cal);
		
		int res = cal.div(100, 10);
		
		assertEquals(10, res);
		System.out.println("div executed..");
		
	}

}
