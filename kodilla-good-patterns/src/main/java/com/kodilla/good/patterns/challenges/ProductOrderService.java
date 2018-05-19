package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderProcessor orderProcessor;
    private OrderRepository orderRepository;


    public ProductOrderService(InformationService informationService, OrderProcessor orderProcessor, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderProcessor = orderProcessor;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = orderProcessor.buy(orderRequest.getUser(), orderRequest.getItem());

        if(isAvailable) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Order not possible to process");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
