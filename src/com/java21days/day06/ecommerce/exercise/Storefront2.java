package com.java21days.day06.ecommerce.exercise;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront2 {
    private final LinkedList catalog = new LinkedList();

    public void addItem2(String id, String name, String price, String quant, String noDisc) {

        Item2 it = new Item2(id, name, price, quant, noDisc);
        catalog.add(it);
    }

    public Item2 getItem2(int i) {
        return (Item2) catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}
