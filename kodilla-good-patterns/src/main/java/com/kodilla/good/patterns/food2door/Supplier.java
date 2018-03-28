package com.kodilla.good.patterns.food2door;

public interface Supplier {
    boolean process(Request request);
    String getName();
    String getNip();
}
