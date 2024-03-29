package com.kodilla.spring.patterns.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
@EnableAspectJAutoProxy
public class ShopService {

	private final List<Order> orders = new ArrayList<>();
	
	@Autowired
	private Authenticator authenticator;
	
	@Autowired
	private ProductService productService;
	
	public Long openOrder(Long userId) {
		if(authenticator.isAuthenticated(userId)) {
			Long maxOrder = (long)orders.stream()
					.mapToInt(o->o.getOrderId().intValue())
					.max().orElse(0);
			orders.add(new Order(maxOrder+1, userId, productService));
			return maxOrder+1;
		} else {
			return -1L;
		}
		
	}
	
	public void addItem(long orderId, Long productId, double qty) {
		orders.stream()
		.filter(o->o.getOrderId().equals(orderId))
		.forEach(o->o.getItems().add(new Item(productId, qty)));
	}
	
	public boolean removeItem(long orderId, Long productId) {
		Iterator<Order> orderIterator = orders.stream()
		.filter(o->o.getOrderId().equals(orderId))
		.iterator();
		
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			int orderSize = theOrder.getItems().size();
			for (int n = 0; n < orderSize; n++) {
				if(theOrder.getItems().get(n).getProductId().equals(productId)) {
					theOrder.getItems().remove(n);
					return true;
				}
			}
		}
		return false;
	}
	
	public BigDecimal calculateValue(long orderId) {
		Iterator<Order> orderIterator = orders.stream()
				.filter(o->o.getOrderId().equals(orderId))
				.iterator();
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			return theOrder.calculateValue();
		}
		return BigDecimal.ZERO;
	}
	
	public boolean doPayment(long orderId) {
		Iterator<Order> orderIterator = orders.stream()
				.filter(o->o.getOrderId().equals(orderId))
				.iterator();
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			if(theOrder.isPaid()) {
				return true;
			} else {
				Random generator = new Random();
				theOrder.setPaid(generator.nextBoolean());
				return theOrder.isPaid();
			}
		}
		return false;
	}
	
	public boolean verifyOrder(long orderId) {
		Iterator<Order> orderIterator = orders.stream()
				.filter(o->o.getOrderId().equals(orderId))
				.iterator();
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			boolean result = theOrder.isPaid();
			Random generator = new Random();
			if(!theOrder.isVerified()) {
				theOrder.setVerified(result && generator.nextBoolean());
			}
				return theOrder.isVerified();
		}
		return false;
	}
	
	public boolean submitOrder(long orderId) {
		Iterator<Order> orderIterator = orders.stream()
				.filter(o->o.getOrderId().equals(orderId))
				.iterator();
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			if(theOrder.isVerified()) {
				theOrder.setSubmitted(true);
			}
				return theOrder.isSubmitted();
		}
		return false;
	}
	
	public void cancelOrder(long orderId) {
		Iterator<Order> orderIterator = orders.stream()
				.filter(o->o.getOrderId().equals(orderId))
				.iterator();
		while(orderIterator.hasNext()) {
			Order theOrder = orderIterator.next();
			orders.remove(theOrder);
		}
	}
}
