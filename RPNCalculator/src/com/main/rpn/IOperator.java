package com.main.rpn;

import java.util.Stack;

public interface IOperator {

	public double apply(Stack stack);
	public String getOperatorType();
}
