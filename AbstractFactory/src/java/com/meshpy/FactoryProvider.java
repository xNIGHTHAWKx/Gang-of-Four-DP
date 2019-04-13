package com.meshpy;

import com.meshpy.animals.AnimalFactory;
import com.meshpy.colors.ColorFactory;

public class FactoryProvider {

    private static final String ANIMAL_FACTORY = "Animal Factory";

    private static final String COLOR_FACTORY = "Color Factory";

    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case ANIMAL_FACTORY:
                return new AnimalFactory();
            case COLOR_FACTORY:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
