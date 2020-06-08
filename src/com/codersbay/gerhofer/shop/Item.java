package com.codersbay.gerhofer.shop;

public abstract class Item {

    protected String description;
    protected Double price;

    protected Item(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    public final void doPackage() {
        System.out.println("lots of paper");
    }

    public final Double applyTax() {
        return this.price * 1.2;
    }
}
