package com.kodilla.spring.patterns.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;
public class PizzaOrderTestSuite {

	@Test
	public void testBasicPizzaOrder() {
		//Given
		PizzaOrder order = new BasicPizzaOrder();
		
		//When
		double cost = order.getCost();
		
		//Then
		assertEquals(15, cost, 0.001);
	}
	
	@Test
	public void testFancyPizzaOrder() {
		//Given
		PizzaOrder order = new BasicPizzaOrder();
		order = new SpeltPizzaDecorator(order);
		order = new BaconDecorator(order);
		order = new PepperDecorator(order);
		order = new ZucchiniDecorator(order);
		order = new ChickenDecorator(order);
		order = new ExtraCheeseDecorator(order);
		
		//When
		double cost = order.getCost();
		String specs = order.getSpecs();
		
		//Then
		assertEquals(34.70, cost, 0.001);
		assertEquals("Pizza: cheese, spelt dough, bacon, pepper, zucchini, chicken, extra cheese", specs);
	}
	
	
}
