package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class ExtraFoodShopSupplier implements Supplier {
    private String name;
    private String nip;
    private ArrayList<String> productsForSale;

    public ExtraFoodShopSupplier(String name, String nip) {
        this.name = name;
        this.nip = nip;
        productsForSale=new ArrayList<>();
        productsForSale.add("Morwa");
        productsForSale.add("Goi berries");
        productsForSale.add("Chia seeds");
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
            System.out.println("Order received for processing!");
            return true;
        }
        System.out.println("No such product at store - order rejected");
        return false;
    }
}
