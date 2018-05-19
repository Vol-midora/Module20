package com.kodilla.good.patterns.challenges;

public class PurchaseOrderRequest implements OrderRequest {
    public User user;
    public String item;

    public PurchaseOrderRequest(User user, String item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }
}
