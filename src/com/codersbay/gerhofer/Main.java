package com.codersbay.gerhofer;

import com.codersbay.gerhofer.shop.Accessory;
import com.codersbay.gerhofer.shop.Item;
import com.codersbay.gerhofer.shop.ShoppingCart;
import com.codersbay.gerhofer.shop.Tracker;
import com.codersbay.gerhofer.zoo.*;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // zooExample();
        shopExample();
    }

    private static void shopExample() {
        Item collar = new Accessory("collar", 5.0);
        Item catTracker = new Tracker("IKATI", 39.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(collar);
        cart.addItem(catTracker);
        cart.finishOrder();

    }

    private static void zooExample() {
        System.out.println("Hello zoo");
        List<Animal> animals = new ArrayList<>();

        Cat minny = new Cat("Angora");
        animals.add(minny);
        //minny.die();
        Cat nakey = new Cat("Sphinx", AnimalCasing.SKIN);
        animals.add(nakey);
        nakey.die();
        nakey.die();
        Dog scoobyDoo = new Dog("Australian Sheperd");
        animals.add(scoobyDoo);

        scoobyDoo.grabStick();

        minny.makeSound();
        nakey.makeSound();
        scoobyDoo.makeSound();

        minny.eat();
        nakey.eat();
        scoobyDoo.eat();
    }

}
