package com.main.rpn;

import java.util.List;
import java.util.Stack;

public class RPNCalculator {

	private String separator;
	
	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public double calc(String exprData) throws Exception{		
	
		handleIntitialValidations(exprData);
		
		String[] arrString = exprData.split(getSeparator());
		
		Stack rpnStack = new Stack();
		
		int capcity;		
		double result = 0;
		boolean isOperator = false;
		String operatorType;
		List opLst = OperatorFactory.getOpList();
		for(int i = 0; i< arrString.length; i++){
			
			if(opLst.contains(arrString[i])){
				isOperator = true;
				capcity = rpnStack.size();									
				IOperator operator = OperatorFactory.getOperatorFactory(arrString[i]);
				operatorType = operator.getOperatorType();
				
				if((operatorType.equals("Binary") && capcity >= 2) || (operatorType.equals("Unary") && capcity >= 1)){
					
					result = operator.apply(rpnStack);					
					rpnStack.push(new Double(result));
					
				}else{
					throw new Exception("Invalid Expression");
				}
			}else{
				rpnStack.push(arrString[i]);
			}			
		}	
		
		if(rpnStack.size() > 1 || !isOperator){
			throw new Exception("Invalid Expression");
		}
		return result;
	}	
	
	private void handleIntitialValidations(String exprData) throws Exception{
		if(null == exprData || exprData.isEmpty()){
			throw new Exception("Input expression is Empty or Null");
		}
		
		if(null == getSeparator() || getSeparator().isEmpty()){
			throw new Exception("Separator is not provided");
		}		
	}
}