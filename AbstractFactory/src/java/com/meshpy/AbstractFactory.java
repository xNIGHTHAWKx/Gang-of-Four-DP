package com.meshpy;

public interface AbstractFactory<T> {
    T create(String type);
}
