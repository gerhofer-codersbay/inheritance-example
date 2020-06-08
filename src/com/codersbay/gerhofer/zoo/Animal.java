package com.codersbay.gerhofer.zoo;

public abstract class Animal {

    private String race;
    private Integer legCount;
    private AnimalCasing casing;

    public Animal(String race, Integer legCount, AnimalCasing casing) {
        this.race = race;
        this.legCount = legCount;
        this.casing = casing;
    }

    public abstract String makeSound();

    public void eat() {
        System.out.println("nom nom");
    }
}
