package com.main.rpn;

import java.util.Stack;

public class PlusOperator implements IOperator{

	public double apply(Stack stack) {
		double val2 = Double.parseDouble(stack.pop().toString());
		double val1 = Double.parseDouble(stack.pop().toString());
		
		return val1 + val2;
	}
	
	public String getOperatorType() {
		return "Binary";
	}
}
