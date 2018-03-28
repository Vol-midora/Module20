package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class SupplierDataBase {
    private HashMap<String, Supplier> supplierBase;

    public SupplierDataBase() {
        supplierBase = new HashMap<>();
    }

    public void addSupplier(Supplier supplier){
        supplierBase.put(supplier.getNip(), supplier);
    }

    public Supplier getSupplier(String nip){
        if(supplierBase.containsKey(nip)) {
            return supplierBase.get(nip);
        } else {
            return null;
        }
    }

    public HashMap<String, Supplier> getSupplierBase() {
        return supplierBase;
    }
}
