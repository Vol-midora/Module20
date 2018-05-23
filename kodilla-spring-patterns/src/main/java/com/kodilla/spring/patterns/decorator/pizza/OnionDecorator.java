package com.kodilla.spring.patterns.decorator.pizza;

public class OnionDecorator extends AbstractPizzaDecorator {

	public OnionDecorator(PizzaOrder order) {
		super(order);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.ONION);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.ONION;
	}
}
