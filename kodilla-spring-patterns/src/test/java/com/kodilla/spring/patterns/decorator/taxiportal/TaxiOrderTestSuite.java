package com.kodilla.spring.patterns.decorator.taxiportal;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TaxiOrderTestSuite {
	
	@Test
	public void testBasicTaxiOrderGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		
		//When
		BigDecimal calculatedCost = theOrder.getCost();
		
		//Then
		assertEquals(new BigDecimal(5), calculatedCost);
	}
	
	@Test
	public void testBasicTaxiOrderGetDescription() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
				
		//When
		String description = theOrder.getDescription();
				
		//Then
		assertEquals("Drive a course", description);
	}
	
	@Test
	public void testTaxiNetworkGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new TaxiNetworkOrderDecorator(theOrder);
		
		//When
		BigDecimal calculatedCost = theOrder.getCost();
				
		//Then
		assertEquals(new BigDecimal(40), calculatedCost);
	}
	
	@Test
	public void testTaxiNetworkGetDescription() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new TaxiNetworkOrderDecorator(theOrder);
		
		//When
		String description = theOrder.getDescription();
						
		//Then
		assertEquals("Drive a course by TaxiNetwork", description);
	}
	
	@Test
	public void testMyTaxiWithChildSeatGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
							
		//When
		BigDecimal calculatedCost = theOrder.getCost();
						
		//Then
		assertEquals(new BigDecimal(37), calculatedCost);
	}
	
	@Test
	public void testMyTaxiWithChildSeatGetDescription() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
							
		//When
		String description = theOrder.getDescription();
											
		//Then
		assertEquals("Drive a course by MyTaxi Network + child seat", description);
		
	}
	
	@Test
	public void testVipTaxiWithChildSeatExpressGetCost() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new TaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		theOrder = new ExpressDecorator(theOrder);
		theOrder = new VipDecorator(theOrder);
							
		//When
		BigDecimal calculatedCost = theOrder.getCost();
						
		//Then
		assertEquals(new BigDecimal(57), calculatedCost);
	}
	
	@Test
	public void testVipTaxiWithChildSeatExpressGetDescription() {
		//Given
		TaxiOrder theOrder = new BasicTaxiOrder();
		theOrder = new TaxiNetworkOrderDecorator(theOrder);
		theOrder = new ChildSeatDecorator(theOrder);
		theOrder = new ExpressDecorator(theOrder);
		theOrder = new VipDecorator(theOrder);
							
		//When
		String description = theOrder.getDescription();
											
		//Then
		assertEquals("Drive a course by TaxiNetwork + child seat express service variant VIP", description);
		
	}
}
