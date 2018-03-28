package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public interface Request {
    String getProduct();
    LocalDate getPurchaseDate();
    LocalDate getDeliveryDueDate();
    Supplier getSupplier();
}
