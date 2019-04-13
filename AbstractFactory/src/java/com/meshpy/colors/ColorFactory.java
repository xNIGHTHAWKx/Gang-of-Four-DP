package com.meshpy.colors;

import com.meshpy.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {

    private static final String WHITE = "White";

    private static final String ORANGE = "Orange";

    private static final String BLACK = "Black";

    @Override public Color create(String type) {
        switch (type) {
            case WHITE:
                return new White();
            case ORANGE:
                return new Orange();
            case BLACK:
                return new Black();
            default:
                return null;
        }
    }
}
