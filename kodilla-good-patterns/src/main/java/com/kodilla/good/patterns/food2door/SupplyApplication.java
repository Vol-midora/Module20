package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class SupplyApplication {
    public static void main(String[] args) {
        Supplier extrafood = new ExtraFoodShopSupplier("ExtraFoodShop", "123-321-23-21");
        Supplier healthyshop = new HealthyShop("HealthyShop", "987-76909-90");
        Supplier glutenfreeshop = new GlutenFreeShop("GlutenFreeShop", "122-221-21-21");

        SupplyProcessor supplyProcessor = new SupplyProcessor(new SupplierDataBase(), new MailInformationService(), new SupplyRepository());
        supplyProcessor.processSupply(new SupplyRequest(extrafood, "Morwa", LocalDate.now(), LocalDate.now().plusDays(5)));
        supplyProcessor.processSupply(new SupplyRequest(healthyshop, "Morwa", LocalDate.now(), LocalDate.now().plusDays(5)));
        supplyProcessor.processSupply(new SupplyRequest(glutenfreeshop, "Rice flour", LocalDate.now()));

        //
//  ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(),
//                new PurchaseOrderProcessor(new ItemDatabase()), new PurchaseOrderRepository());
//
//        productOrderService.process(new PurchaseOrderRequest(user, "Kik"));
    }
}
