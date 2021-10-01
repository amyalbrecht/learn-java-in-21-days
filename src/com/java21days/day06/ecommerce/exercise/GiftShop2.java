package com.java21days.day06.ecommerce.exercise;

public class GiftShop2 {
    public static void main(String[] arguments) {
        Storefront2 store = new Storefront2();
        store.addItem2("C01", "MUG", "9.99", "150", "true");
        store.addItem2("C02", "LG MUG", "12.99", "82", "false");
        store.addItem2("C03", "MOUSEPAD", "10.49", "800", "true");
        store.addItem2("D01", "T SHIRT", "16.99", "90", "false");
        store.sort();

        for (int i = 0; i < store.getSize(); i++) {
            Item2 show = (Item2) store.getItem2(i);
            System.out.println("\nItem ID: " + show.getId() +
                    "\nName: " + show.getName() +
                    "\nRetail Price: $" + show.getRetail() +
                    "\nPrice: $" + show.getPrice() +
                    "\nQuantity: " + show.getQuantity() +
                    "\nNo Discount? " + show.isNoDiscount());
        }
    }
}
