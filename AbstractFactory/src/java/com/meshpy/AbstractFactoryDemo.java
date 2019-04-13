package com.meshpy;

import com.meshpy.animals.Animal;
import com.meshpy.animals.Cat;
import com.meshpy.colors.Color;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        // creating Animal using AbstractFactory
        abstractFactory = FactoryProvider.getFactory("Animal Factory");
        Animal cat = (Cat) abstractFactory.create("Cat");
        System.out.println(cat.getAnimal());

        // creating Color using AbstractFactory
        abstractFactory = FactoryProvider.getFactory("Color Factory");
        Color white = (Color) abstractFactory.create("White");
        System.out.println(white.getColor());
    }
}
