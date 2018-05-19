package com.kodilla.good.patterns.challenges;
import java.util.*;

public class ItemDatabase {
    private ArrayList<String> itemList = new ArrayList<>();

    public ItemDatabase() {
        itemList.add("Stolik");
        itemList.add("Kornet");
        itemList.add("Taboret");
        itemList.add("Tiara");
        itemList.add("Tacka");
        itemList.add("Kurkuma");
        itemList.add("Foremka");
        itemList.add("Miska");
        itemList.add("Lustro");
    }

    public ArrayList<String> getItemList() {
        return itemList;
    }

    public void removeItem(String item) {
        itemList.remove(item);
    }
}
