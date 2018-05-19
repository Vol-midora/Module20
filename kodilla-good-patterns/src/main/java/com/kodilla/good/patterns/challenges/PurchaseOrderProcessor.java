package com.kodilla.good.patterns.challenges;

public class PurchaseOrderProcessor implements OrderProcessor {
    private ItemDatabase itemDatabase;

    public PurchaseOrderProcessor(ItemDatabase itemDatabase) {
        this.itemDatabase = itemDatabase;
    }

    public boolean buy(User user, String item){
        if(itemDatabase.getItemList().contains(item)) {
            itemDatabase.removeItem(item);
            return true;
        }
        return false;
    }
}
