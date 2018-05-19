package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class HealthyShop implements Supplier {
    private String name;
    private String nip;
    private ArrayList<String> productsForSale;

    public HealthyShop(String name, String nip) {
        this.name = name;
        this.nip = nip;
        productsForSale=new ArrayList<>();
        productsForSale.add("Chocolate");
        productsForSale.add("Walnuts");
        productsForSale.add("Cranberries");
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public ArrayList<String> getProductsForSale() {
        return productsForSale;
    }

    @Override
    public boolean process(Request supplyRequest) {
        if(productsForSale.contains(supplyRequest.getProduct())){
            System.out.println("Product available - order in progress");
            return true;
        }
        System.out.println("Out of stock - order cancelled");
        return false;
    }
}
