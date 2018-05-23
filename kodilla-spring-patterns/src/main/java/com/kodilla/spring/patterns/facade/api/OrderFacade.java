package com.kodilla.spring.patterns.facade.api;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import com.kodilla.spring.patterns.facade.ShopService;

@Service
@EnableAspectJAutoProxy
public class OrderFacade {

	@Autowired
	private ShopService shopService;
	//private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);
	
	public void processOrder(final OrderDto order, final Long userId) throws OrderProcessingException {
		boolean wasError = false;
		long orderId = shopService.openOrder(userId);
		//LOGGER.info("Registering new order, ID: " + orderId);
		if(orderId < 0) {
			//LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORIZED);
			wasError=true;
			throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORIZED);
		}
		try {
			for (ItemDto itemDto : order.getItems()) {
				//LOGGER.info("Adding item: " + itemDto.getProductId() + ", quantity: " + itemDto.getQty());
				shopService.addItem(orderId, itemDto.getProductId(),  itemDto.getQty());
			}
			BigDecimal value = shopService.calculateValue(orderId);
			//LOGGER.info("Order value is: "+value + " USD");
			
			if(!shopService.doPayment(orderId)) {
				//LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
				wasError = true;
				throw new OrderProcessingException(OrderProcessingException.ERR_PAYMENT_REJECTED);
			}
			//LOGGER.info("Payment for Order was done");
			
			if(!shopService.verifyOrder(orderId)) {
				//LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
				wasError = true;
				throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
			}
			//LOGGER.info("Order ready to submit");
			
			if(!shopService.submitOrder(orderId)) {
				//LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERROR);
				wasError = true;
				throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERROR);
			}
			//LOGGER.info("Order: " + orderId + " submitted");	
		} finally {
			if(wasError) {
				//LOGGER.info("Cancelling order " + orderId);
				shopService.cancelOrder(orderId);
			}
		}

		
	}
	
}
