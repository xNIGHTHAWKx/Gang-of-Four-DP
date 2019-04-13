package com.meshpy;

import com.meshpy.dogs.Dog;
import com.meshpy.dogs.DogFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Dog firstDog = DogFactory.getDog("Poodle");
        firstDog.woof();

        Dog secondDog = DogFactory.getDog("Siberian Husky");
        secondDog.woof();

        Dog thirdDog = DogFactory.getDog("Rottweiler");
        thirdDog.woof();
    }
}
