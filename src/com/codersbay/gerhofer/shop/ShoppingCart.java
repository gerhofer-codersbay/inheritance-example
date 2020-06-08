package com.codersbay.gerhofer.shop;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void finishOrder() {
        for (Item item : items) {
            item.doPackage();
        }
    }
}
