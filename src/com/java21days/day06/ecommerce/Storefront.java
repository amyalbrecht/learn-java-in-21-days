package com.java21days.day06.ecommerce;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront {
    private final LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quant) {

        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }

    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}
