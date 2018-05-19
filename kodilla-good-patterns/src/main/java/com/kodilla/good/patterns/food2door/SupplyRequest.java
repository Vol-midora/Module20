package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class SupplyRequest implements Request {
    private Supplier supplier;
    private String product;
    private LocalDate purchaseDate;
    private LocalDate deliveryDueDate;

    public SupplyRequest(Supplier supplier, String product, LocalDate purchaseDate) {
        this.supplier = supplier;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.deliveryDueDate = purchaseDate.plusDays(10);
    }

    public SupplyRequest(Supplier supplier, String product, LocalDate purchaseDate, LocalDate deliveryDueDate) {
        this.supplier = supplier;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.deliveryDueDate = deliveryDueDate;
    }

    public String getProduct() {
        return product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getDeliveryDueDate() {
        return deliveryDueDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
