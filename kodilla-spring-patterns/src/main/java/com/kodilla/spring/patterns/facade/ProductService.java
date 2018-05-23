package com.kodilla.spring.patterns.facade;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public BigDecimal getPrice(Long productId) {
		Random generator = new Random();
		return new BigDecimal(generator.nextInt(10000)/100);
	}
}
