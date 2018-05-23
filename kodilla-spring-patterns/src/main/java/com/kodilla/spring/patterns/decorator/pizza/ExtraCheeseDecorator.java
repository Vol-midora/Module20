package com.kodilla.spring.patterns.decorator.pizza;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {

	public ExtraCheeseDecorator(PizzaOrder order) {
		super(order);
	}

	@Override
	public double getCost() {
		return super.getCost() + PizzaComponents.getPriceList().get(PizzaComponents.EXTRA_CHEESE);
	}

	@Override
	public String getSpecs() {
		return super.getSpecs() + ", " + PizzaComponents.EXTRA_CHEESE;
	}
}
