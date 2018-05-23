package com.kodilla.spring.patterns.decorator.pizza;

public class PepperDecorator extends AbstractPizzaDecorator {

	public PepperDecorator(PizzaOrder order) {
		super(order);
	}

	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.PEPPER);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.PEPPER;
	}
}
