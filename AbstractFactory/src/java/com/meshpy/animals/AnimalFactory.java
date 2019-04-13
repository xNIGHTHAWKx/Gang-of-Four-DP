package com.meshpy.animals;

import com.meshpy.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    private static final String CAT = "Cat";

    private static final String BEAR = "Bear";

    private static final String DUCK = "Duck";

    @Override public Animal create(String animalType) {
        switch (animalType) {
            case CAT:
                return new Cat();
            case BEAR:
                return new Bear();
            case DUCK:
                return new Duck();
            default:
                return null;
        }
    }
}
