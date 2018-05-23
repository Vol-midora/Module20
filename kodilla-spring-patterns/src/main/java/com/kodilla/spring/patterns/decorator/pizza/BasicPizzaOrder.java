package com.kodilla.spring.patterns.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {

	
	public double getCost() {
		return PizzaComponents.getPriceList().get(PizzaComponents.BASIC);
	}
	
	public String getSpecs() {
		return PizzaComponents.BASIC;
	}
}
