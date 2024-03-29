package com.kodilla.spring.patterns.decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {

	public VipDecorator(TaxiOrder taxiOrder) {
		super(taxiOrder);
	}

	@Override
	public BigDecimal getCost() {
		//hardcoded stub cost = 10
		return super.getCost().add(new BigDecimal(10));
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " variant VIP";
		
	}
}
