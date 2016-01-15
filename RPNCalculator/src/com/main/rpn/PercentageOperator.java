package com.main.rpn;

import java.util.Stack;

public class PercentageOperator  implements IOperator{

	public double apply(Stack stack) {
		double val1 = Double.parseDouble(stack.pop().toString());
		
		return val1 / 100;
	}

	public String getOperatorType() {
		return "Unary";
	}
}
