package com.itea.java.basic.l16.classwork;

import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {

        Method[] methods = List.class.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        List list = List.class.newInstance();
        System.out.println();
    }
}
