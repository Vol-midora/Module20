package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class SupplyRepository implements Repository{
    private HashMap<Supplier, String> orders;

    public SupplyRepository() {
        this.orders = new HashMap<>();
    }

    public void createOrder(Supplier user, String item){
        orders.put(user, item);
    }

    public HashMap<Supplier, String> getOrders() {
        return orders;
    }
}
