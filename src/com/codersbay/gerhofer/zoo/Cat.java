package com.codersbay.gerhofer.zoo;

import com.codersbay.gerhofer.zoo.AlreadyDeadException;
import com.codersbay.gerhofer.zoo.Animal;
import com.codersbay.gerhofer.zoo.AnimalCasing;

public class Cat extends Animal implements Godlike, Cuddleable {

    private Integer liveCount;

    public Cat(String race, AnimalCasing casing) {
        super(race, 4, casing);
        this.liveCount = 9;
    }

    public Cat(String race) {
        super(race, 4, AnimalCasing.FUR);
    }

    @Override
    public String makeSound() {
        System.out.println("Make sound: Meow");
        return "meow";
    }

    @Override
    public void eat() {
        System.out.println("Crunch crunch. Mouse is delicious.");
    }

    /**
     * @throws AlreadyDeadException if the cat has a live count of zero or less
     * @return if the cat is really dead or has lives left
     */
    public boolean die() {
        if (this.liveCount == 0) {
            throw new AlreadyDeadException("Cat's already dead :(");
        }
        this.liveCount--;
        return this.liveCount <= 0;
    }

}
