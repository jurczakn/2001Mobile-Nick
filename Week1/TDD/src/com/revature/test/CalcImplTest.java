package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.exception.ResultTooLargeException;
import com.revature.util.CalcImpl;

public class CalcImplTest {
	
	private CalcImpl<Integer> intCalc;
	
	private CalcImpl<Double> doubleCalc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		intCalc = new CalcImpl<Integer>();
		doubleCalc = new CalcImpl<Double>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addPositiveIntegers() throws ResultTooLargeException {
		
		assertEquals("5 + 10 should be 15", new Integer(15), intCalc.add(5, 10));
		
	}
	
	@Test
	public void addPositiveDoubles() throws ResultTooLargeException {
		assertEquals("2.3 + 3.4 should be 5.7", new Double(5.7), doubleCalc.add(2.3,  3.4), 1E-5);
	}
	
	@Test(expected = ResultTooLargeException.class)
	public void addTooLargeIntegers() throws ResultTooLargeException {
		intCalc.add(Integer.MAX_VALUE, 1);
	}

}
