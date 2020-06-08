package com.codersbay.gerhofer.zoo;

import com.codersbay.gerhofer.zoo.Animal;
import com.codersbay.gerhofer.zoo.AnimalCasing;

public class Dog extends Animal {

    public Dog(String race) {
        super(race, 4, AnimalCasing.FUR);
    }

    @Override
    public String makeSound() {
        System.out.println("Make sound: Woof");
        return "Woof";
    }

    public void grabStick() {
        System.out.println("Dog fetches stick");
    }
}
