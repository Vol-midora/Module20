package com.kodilla.spring.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

	@Test
	public void testCalculations() {
		//Given
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		
		Calculator calculator = context.getBean(Calculator.class);
		double a = 14.6;
		double b = 5.7;
		
		//When
		double sum = calculator.add(a, b);
		double dif = calculator.sub(a, b);
		double mult = calculator.mul(a, b);
		double div = calculator.div(a,b);
		
		//Then
		Assert.assertEquals(sum, a+b, 0.0001);
		Assert.assertEquals(dif, a-b, 0.0001);
		Assert.assertEquals(mult, a*b, 0.0001);
		Assert.assertEquals(div, a/b, 0.0001);
	}
}
