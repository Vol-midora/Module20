package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.util.*;

public class GlutenFreeShop implements Supplier {
    private String name;
    private String nip;
    private HashMap<String, String> productsForSale;

    public GlutenFreeShop(String name, String nip) {
        this.name = name;
        this.nip = nip;
        productsForSale=new HashMap<>();
        productsForSale.put("Rice flour", "100g");
        productsForSale.put("Almond flour", "1000g");
        productsForSale.put("Soy milk", "0,75l");
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public HashMap<String, String> getProductsForSale() {
        return productsForSale;
    }

    @Override
    public boolean process(Request supplyRequest) {
        if(productsForSale.containsKey(supplyRequest.getProduct()) && supplyRequest.getDeliveryDueDate().isAfter(LocalDate.now().plusDays(14))) {
            System.out.println("Product available - order in progress");
            return true;
        } else if(!supplyRequest.getDeliveryDueDate().isAfter(LocalDate.now().plusDays(14))) {
            System.out.println("The shop does not accept orders with less than 15 days realization time");
            return false;
        }
        System.out.println("Out of stock - order cancelled");
        return false;
    }
}
