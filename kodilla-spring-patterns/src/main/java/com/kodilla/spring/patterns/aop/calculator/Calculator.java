package com.kodilla.spring.patterns.aop.calculator;

import java.math.BigDecimal;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class Calculator {

	public double add(double x, double y) {
		return x+y;
	}
	public double sub(double x, double y) {
		return x-y;
	}
	public double mul(double x, double y) {
		return x*y;
	}
	public double div(double x, double y) {
		if (y==0) {
			throw new ArithmeticException("Divide by zero");
		}
		return x/y;
	}
	public BigDecimal factorial(BigDecimal n) {
		if(n.compareTo(BigDecimal.ONE) > 0) {
			return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
		} else if (n.equals(BigDecimal.ZERO ) || n.equals(BigDecimal.ONE)) {
			return BigDecimal.ONE;
		} else throw new ArithmeticException("Factorial argument cannot be negative");
	}
	
}
