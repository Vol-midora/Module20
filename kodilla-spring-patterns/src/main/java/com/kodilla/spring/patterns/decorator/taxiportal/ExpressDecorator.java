package com.kodilla.spring.patterns.decorator.taxiportal;

import java.math.BigDecimal;

public class ExpressDecorator extends AbstractTaxiOrderDecorator {

	public ExpressDecorator(TaxiOrder taxiOrder) {
		super(taxiOrder);
	}

	@Override
	public BigDecimal getCost() {
		//hardcoded stub cost = 5
		return super.getCost().add(new BigDecimal(5));
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " express service";
		
	}
}