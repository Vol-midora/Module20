package com.kodilla.spring.patterns.decorator.pizza;

public class ChickenDecorator extends AbstractPizzaDecorator {

	public ChickenDecorator(PizzaOrder order) {
		super(order);
	}

	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.CHICKEN);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.CHICKEN;
	}
}
