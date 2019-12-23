package com.itea.java.basic.l16;

public interface IGen<T extends Comparable<T>> {

    T min();
    T max();
}
