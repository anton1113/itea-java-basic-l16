package com.itea.java.basic.l16;

public class GenConstructor {

    public <T> GenConstructor(T value) {
        System.out.println(value);
    }

    public <T extends String, K extends Integer> GenConstructor(T param1 , K param2) {
        // impl...
    }
}
