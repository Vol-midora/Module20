package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean purchaseResult;

    public OrderDto(User user, boolean purchaseResult) {
        this.user = user;
        this.purchaseResult = purchaseResult;
    }

    public User getUser() {
        return user;
    }

    public boolean getPurchaseResult() {
        return purchaseResult;
    }
}
