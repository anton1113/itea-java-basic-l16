package com.itea.java.basic.l16;

public class GenericExampleRunner {

    public static void main(String[] args) {

//        GenericExample<Double> doubleGenericExample = new GenericExample<>("Text"); // error

        GenericExample<String> stringGenericExample = new GenericExample<>("Hello");
        GenericExample<Integer> integerGenericExample = new GenericExample<>(25);
//        stringGenericExample = integerGenericExample; // error
    }
}
