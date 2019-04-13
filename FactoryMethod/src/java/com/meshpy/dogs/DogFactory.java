package com.meshpy.dogs;

public class DogFactory {

    private static final String POODLE = "Poodle";

    private static final String ROTTWEILER = "Rottweiler";

    private static final String SIBERIAN_HUSKY = "Siberian Husky";

    public static Dog getDog(String typeOfDog) {
        switch (typeOfDog) {
            case POODLE:
                return new PoodleDog();
            case ROTTWEILER:
                return new RottweilerDog();
            case SIBERIAN_HUSKY:
                return new SiberianHuskyDog();
            default:
                return null;
        }
    }
}
