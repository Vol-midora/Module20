package com.kodilla.spring.patterns.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
	BigDecimal getCost();
	String getDescription();

}
