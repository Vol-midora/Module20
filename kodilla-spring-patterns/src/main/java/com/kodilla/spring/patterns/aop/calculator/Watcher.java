package com.kodilla.spring.patterns.aop.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
@Aspect
public class Watcher {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Watcher.class);
	
	@Before("execution(* com.kodilla.spring.patterns.aop.calculator.Calculator.factorial(..)) && args(theNumber) && target(object)")
	public void logEvent(BigDecimal theNumber, Object object) {
		LOGGER.info("Class: " + object.getClass().getName() + ", Arguments: " + theNumber);
	}
	
	@Around("execution(* com.kodilla.spring.patterns.aop.calculator.Calculator.factorial(..))")
	public Object logEvent(final ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		try {
			long begin = System.currentTimeMillis();
			result = proceedingJoinPoint.proceed();
			long end = System.currentTimeMillis();
			LOGGER.info("Time consumed: " + (end - begin) + "ms");
		} catch (Throwable e) {
			LOGGER.error(e.getMessage());
		}
		return result;
	}

}
