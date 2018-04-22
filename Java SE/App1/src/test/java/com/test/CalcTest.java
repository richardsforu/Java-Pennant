package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.Calculator;

public class CalcTest {
	
	private Calculator calc;
	
	@Before
	public void getObject() {
		calc=new Calculator();
		
	}
	
	@Test
	public void testMethod() {
		
		int actResult=calc.add(100, 400);
		assertEquals(400, actResult);
		
		
	}
	
	
	

}
