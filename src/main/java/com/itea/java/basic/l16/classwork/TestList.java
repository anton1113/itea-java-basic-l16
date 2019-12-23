package com.itea.java.basic.l16.classwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) throws IOException {

        List list = new List();
        list.add("Hello");
        list.add(123);

        List<String> stringList = new List<>();
        stringList.add("Hello");

        List<Integer> integerList = new List<>();
        List<Integer> integerList1 = new List<>();
        List<Double> doubleList = new List<>();

        integerList1 = integerList;

        list = integerList;
        list = doubleList;

        String a = "a";
        String b = "b";

        b = a;

//        List<Integer> intList
    }
}
