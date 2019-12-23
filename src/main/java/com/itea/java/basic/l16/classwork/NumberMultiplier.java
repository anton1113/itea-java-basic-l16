package com.itea.java.basic.l16.classwork;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class NumberMultiplier {

    public static void main(String[] args) {

        System.out.println(multiply(1, 2));
        System.out.println(multiply(1.01, 1.23));
        System.out.println(multiply(0.2f, 25.15f));

        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>();

        System.out.println(fillCollection(arrayList, "Hello"));
        System.out.println(fillCollection(hashSet, 17));
        System.out.println(fillCollection(arrayDeque, 0.25));
    }

    private static <T extends Number> Number multiply(T number1, T number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    private static <T extends Collection<K>, K> T fillCollection(T col, K obj) {
        for (int i = 0; i < 10; i++) {
            col.add(obj);
        }
        return col;
    }
}
