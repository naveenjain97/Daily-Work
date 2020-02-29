package com.cts.training.Feb28;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalTest {
	private static Calculator cal;
@BeforeClass
	public static void init() {
		cal = new Calculator();
		System.out.println("Object created!!!");
	}

	@AfterClass
	public static void destroy() {
		cal = null;
		System.out.println("object destroyed!!!");
	}
	@Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, cal.add(12,5));
		System.out.println("Inside add test");
		
	}
	
	@Ignore
	@Test
public void test_sub_success()
{
	assertEquals(7,cal.sub(5,12));
	System.out.println("Inside Sub case");
}
	@Ignore
	@Test
	public void test_mul_success()
	{
		assertEquals(60,cal.mul(5,12));
		System.out.println("Inside Multiply case");
	}
	@Ignore
	@Test
	public void test_div_success()
	{
		assertEquals(6,cal.div(12,2));
		System.out.println("Inside Divide case");
	}
	@Test
	public void test_tocheck_primenumber_Success() {
		assertEquals(true,cal.isPrime(5));
	}
	@Test
	public void test_tocheck_primenumber_Failure() {
		assertEquals(false,cal.isPrime(4));
	}
}
