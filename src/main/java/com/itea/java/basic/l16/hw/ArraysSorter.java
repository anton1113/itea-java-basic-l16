package com.itea.java.basic.l16.hw;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysSorter {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 5, 31, 3};
        String[] strings = {"hello", "itea", "java", "core"};
        List[] lists = {new ArrayList(), new LinkedList(), new ArrayQueue(16)};

        sort(integers);
        sort(strings);
//        sort(lists); ??

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(strings));
    }

    private static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }
}
