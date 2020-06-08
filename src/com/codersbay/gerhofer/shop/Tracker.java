package com.codersbay.gerhofer.shop;

public class Tracker extends Item {

    private String id;

    public Tracker(String description, Double price) {
        super(description, price);
        id = "TRCAT";
    }

//    @Override
//    public void doPackage() {
//        super.doPackage();
//        System.out.println("add bubble wrap");
//    }

}
