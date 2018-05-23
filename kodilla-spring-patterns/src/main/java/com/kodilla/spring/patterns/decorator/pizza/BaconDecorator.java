package com.kodilla.spring.patterns.decorator.pizza;

public class BaconDecorator extends AbstractPizzaDecorator {

	public BaconDecorator(PizzaOrder order) {
		super(order);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.BACON);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.BACON;
	}
}
