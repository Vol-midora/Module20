package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        User user = new User("Midora", "midora@gmail.com");

        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(),
                new PurchaseOrderProcessor(new ItemDatabase()), new PurchaseOrderRepository());

        productOrderService.process(new PurchaseOrderRequest(user, "Kik"));
    }
}
