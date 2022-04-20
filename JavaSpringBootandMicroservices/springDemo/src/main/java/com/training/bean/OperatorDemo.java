package com.training.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.training.interfaces.Operator;

@Component
public class OperatorDemo {
	
	//inject Operator
	
	@Autowired
//	@Qualifier("op")
	private Operator operator;

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public void printResult(int x,int y) {
		operator.operator(x, y);
	}
}
