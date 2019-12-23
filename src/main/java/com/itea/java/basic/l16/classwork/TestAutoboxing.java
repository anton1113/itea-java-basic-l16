package com.itea.java.basic.l16.classwork;

public class TestAutoboxing {

    public static void main(String[] args) {
        Integer integer = 45;
        int intNumber = new Integer(113);

        Short shortObject = 10;
//        short shortPrimitive = new Short();

        Double doubleObject = 1.0;
        double doublePrimitive = new Double(1.00);

        Boolean booleanObject = true;
        boolean booleanPrimitive = new Boolean(false);

        // ====

        Boolean booleanObj = new Boolean(true);
        boolean boolenPr = new Boolean(false).booleanValue();

        int value = integer.intValue();
    }
}
