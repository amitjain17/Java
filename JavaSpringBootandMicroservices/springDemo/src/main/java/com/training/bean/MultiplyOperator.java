package com.training.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.training.interfaces.Operator;

@Component
@Primary
public class MultiplyOperator implements Operator {

	@Override
	public void operator(int x, int y) {
		System.out.println("Result: "+(x*y));
	}

}
