package com.test.rpn;

import org.testng.Assert;

import com.main.rpn.RPNCalculator;

import junit.framework.TestCase;

public class TestRPNCalc extends TestCase{

	public void testCase1(){
		String sep = ",";
		
		String calcData = "4,5,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(9, result, 0);
	}
	
	public void testCase2(){
		String sep = ",";
		
		String calcData = "1,7,+";
		RPNCalculator calculator = new RPNCalculator();
		
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(8, result, 0);
	}
	
	public void testCase3(){
		String sep = ",";
		
		String calcData = "7,1,-";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(6, result, 0);
	}
	
	public void testCase4(){
		String sep = ",";
		
		String calcData = "1,5,-";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(-4, result, 0);
	}
	
	
	public void testCase5(){
		String sep = ",";
		
		String calcData = "1,5,-,5,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(1, result, 0);
	}
	
	public void testCase6(){
		String sep = ",";
		
		String calcData = "5,1,-,5,+,6,4,+,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(19, result, 0);
	}
	
	public void testCase7(){
		String sep = ",";
		
		String calcData = "4,5,*";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(20, result, 0);
	}
	
	public void testCase8(){
		String sep = ",";
		
		String calcData = "5,1,-,5,+,6,4,*,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(33, result, 0);
	}

	public void testCase9(){
		String sep = ",";
		
		String calcData = "20,5,/";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(4, result, 0);
	}
	
	public void testCase10(){
		String sep = ",";
		
		String calcData = "5,1,-,5,+,6,3,/,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(11, result, 0);
	}
	
	
	
	
	public void testCase21(){
		String sep = ",";
		
		String calcData = "1,2,3,+,-";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(-4, result, 0);
	}
	
	public void testCase22(){
		String sep = ",";
		
		String calcData = "6,2,*,3,/";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(4, result, 0);
	}
	
	public void testCase27(){
		String sep = ",";
		
		String calcData = "5,1,2,+,4,*,+,3,-";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}		
		Assert.assertEquals(14, result, 0);
	}
	
	public void testCase28(){
		String sep = ",";
		
		String calcData = "3,3,+,3";
		RPNCalculator calculator = new RPNCalculator();
		try {
			calculator.setSeparator(sep);
			calculator.calc(calcData);
		} catch (Exception e) {
			Assert.assertEquals("Invalid Expression", e.getMessage());
		}		
	}
	
	public void testCase29(){
		String sep = ",";
		
		String calcData = "+,3,3";
		RPNCalculator calculator = new RPNCalculator();
		try {
			calculator.setSeparator(sep);
			calculator.calc(calcData);
		} catch (Exception e) {
			Assert.assertEquals("Invalid Expression", e.getMessage());
		}		
	}
	
	public void testCase30(){
		String sep = ",";
		
		String calcData = "3";
		RPNCalculator calculator = new RPNCalculator();
		try {
			calculator.setSeparator(sep);
			calculator.calc(calcData);
		} catch (Exception e) {
			Assert.assertEquals("Invalid Expression", e.getMessage());
		}		
	}
	
	
	public void testCase31(){
		String sep = ",";
		
		String calcData = "3.1,2.2,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
		Assert.assertEquals(5.3, result, 0.1);		
	}
	
	
	public void testCase32(){
		String sep = ",";
		
		String calcData = "3.1,2.2,-,4.1,+,4,/";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
		Assert.assertEquals(1.25, result, 0);		
	}
	
	public void testCase33(){
		String sep = ",";
		
		String calcData = "3.1,2.2,*";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
		Assert.assertEquals(result, 6.82, 0.1);		
	}
	
	public void testCase34(){
		String sep = ",";
		
		String calcData = "50,%,.25,+";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
		Assert.assertEquals(result, 0.75, 0.1);		
	}
	
	public void testCase35(){
		String sep = ",";
		
		String calcData = "50,%";
		RPNCalculator calculator = new RPNCalculator();
		double result = -999;
		try {
			calculator.setSeparator(sep);
			result = calculator.calc(calcData);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
		Assert.assertEquals(result, 0.5, 0.1);		
	}
}
