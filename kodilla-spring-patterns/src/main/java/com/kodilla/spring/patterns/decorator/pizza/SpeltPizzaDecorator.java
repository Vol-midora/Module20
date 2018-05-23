package com.kodilla.spring.patterns.decorator.pizza;

public class SpeltPizzaDecorator extends AbstractPizzaDecorator {

	public SpeltPizzaDecorator(PizzaOrder order) {
		super(order);
	}

	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.SPELT_DOUGH);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.SPELT_DOUGH;
	}
}
