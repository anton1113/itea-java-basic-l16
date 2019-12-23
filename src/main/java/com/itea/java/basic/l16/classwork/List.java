package com.itea.java.basic.l16.classwork;

public class List<T extends Comparable<T>> {

    private Object[] values = new Object[100];
    private int size = 0;

    public void add(T elem) {
        values[size++] = elem;
    }

    public void sort() {
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                T obj1 = (T) values[i];
                T obj2 = (T) values[j];
                if (obj1.compareTo(obj2) < 0) {
                    T tmp = (T) values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }
    }

    public void clear() {
        values = new Object[100];
        size = 0;
    }

    public void print() {
        for(Object obj : values) {
            System.out.print(obj.toString() + " ");
        }
    }
}
