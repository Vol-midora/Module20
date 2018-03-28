package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class PurchaseOrderRepository implements OrderRepository {
    private HashMap<User, String> orders;

    public PurchaseOrderRepository() {
        this.orders = new HashMap<>();
    }

    public void createOrder(User user, String item){
        orders.put(user, item);
    }

    public HashMap<User, String> getOrders() {
        return orders;
    }
}
