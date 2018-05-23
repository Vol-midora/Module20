package com.kodilla.spring.patterns.decorator.pizza;

import java.util.HashMap;
import java.util.Map;

public class PizzaComponents {
	public static final String BASIC = "Pizza: cheese";
	public static final String THICK_DOUGH = "extra thick dough";
	public static final String SPELT_DOUGH = "spelt dough";
	public static final String BACON = "bacon";
	public static final String PEPPER = "pepper";
	public static final String ZUCCHINI = "zucchini";
	public static final String ONION = "onion";
	public static final String CHICKEN = "chicken";
	public static final String EXTRA_CHEESE = "extra cheese";
	
	private static Map<String, Double> priceList = new HashMap<>();
	
	public static Map<String, Double> getPriceList() {
		if (priceList.isEmpty() ) {
		priceList.put(BASIC, 15.00);
		priceList.put(THICK_DOUGH, 2.00);
		priceList.put(SPELT_DOUGH, 2.50);
		priceList.put(BACON, 4.50);
		priceList.put(PEPPER, 3.00);
		priceList.put(ZUCCHINI, 3.20);
		priceList.put(ONION, 2.00);
		priceList.put(CHICKEN, 3.50);
		priceList.put(EXTRA_CHEESE, 3.00);
		}
		return priceList;
	}
}
