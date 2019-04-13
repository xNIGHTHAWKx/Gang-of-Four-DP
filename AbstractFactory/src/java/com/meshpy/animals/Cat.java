package com.meshpy.animals;

public class Cat implements Animal {

    @Override public String getAnimal() {
        return "Cat";
    }

    @Override public String makeSound() {
        return "Meeeow";
    }
}
