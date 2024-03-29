package com.kodilla.spring.patterns.facade;

import java.math.BigDecimal;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class FacadeWatcher {
	
private final static Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);
	
	@AfterReturning(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.openOrder(..))", returning = "retVal")
	public void logOrderRegistration(Object retVal) {
		LOGGER.info("Registering new order, ID: " + (Long)retVal);
	}
	
	@AfterThrowing(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.openOrder(..))", throwing = "ex")
	public void logOrderRegistrationError(Exception ex) {
		LOGGER.error(ex.getMessage());
	}
	
	@Before("execution(* com.kodilla.spring.patterns.facade.ShopService.addItem(..)) &&args(orderId, productId, qty)")
	public void logAddingProduct(long orderId, long productId, double qty) {
		LOGGER.info("Adding item: " + productId + ", quantity: " + qty);
	}
	
	@AfterReturning(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.calculateValue(..))", returning = "value")
	public void logCalculateValue(Object value) {
		LOGGER.info("Order value is: "+(BigDecimal)value + " USD");
	}
	
	@AfterReturning(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.doPayment(..))", returning ="value")
	public void logPayment(Object value) {
		if((boolean)value) {
			LOGGER.info("Payment for Order was done");
		}
	}
	
	@AfterReturning(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.verifyOrder(..))", returning ="value")
	public void logVerification(Object value) {
		if((boolean)value) {
			LOGGER.info("Order ready to submit");
		}
	}
	
	@AfterReturning(pointcut = "execution(* com.kodilla.spring.patterns.facade.ShopService.submitOrder(..)) && args(argument)", returning ="value")
	public void logSubmission(long argument, Object value) {
		if((boolean)value) {
			LOGGER.info("Order: " + argument + " submitted");
		}
	}
		
	@AfterThrowing(pointcut = "execution(* com.kodilla.spring.patterns.facade.api.OrderFacade.processOrder(..))", throwing = "ex")
	public void logFacadeError(Exception ex) {
		LOGGER.error(ex.getMessage());
	}
	
	@Before("execution(* com.kodilla.spring.patterns.facade.ShopService.cancelOrder(..)) &&args(orderId)")
	public void logCancellingOrder(long orderId) {
		LOGGER.info("Cancelling order " + orderId);
	}

}
