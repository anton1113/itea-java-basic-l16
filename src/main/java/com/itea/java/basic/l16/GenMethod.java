package com.itea.java.basic.l16;

public class GenMethod {

    public static void main(String[] args) {
        System.out.println(avg(1, 5));
    }

    public static <T extends Number> double avg(T number1, T number2) {
        return (number1.doubleValue() + number2.doubleValue()) / 2;
    }
}
