package com.main.rpn;

import java.util.ArrayList;
import java.util.List;

public class OperatorFactory {

	private OperatorFactory(){};
	
	private static List operatorLst = new ArrayList();
	
	static{
		operatorLst.add("+");
		operatorLst.add("-");
		operatorLst.add("*");
		operatorLst.add("/");
		operatorLst.add("%");
	}
	
	public static List getOpList(){
		return operatorLst;
	}
	
	public static IOperator getOperatorFactory(String operator){
		
		IOperator operatorFactory = null;
				
		if(operator.equals("+")){
			operatorFactory =  new PlusOperator();
		}else if(operator.equals("-")){
			operatorFactory =  new MinusOperator();
		}else if(operator.equals("*")){
			operatorFactory =  new MultiplyOperator();
		}else if(operator.equals("/")){
			operatorFactory =  new DivisionOperator();
		}else if(operator.equals("%")){
			operatorFactory =  new PercentageOperator();
		}
		return operatorFactory;
	}	
}
