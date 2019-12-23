package com.itea.java.basic.l16;

public class NumGen<T extends Number> {

    private T[] numbers;

    public NumGen(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double total = 0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total / numbers.length;
    }
}

class Foo {

    public static boolean equalAverages(NumGen ng1, NumGen ng2) {
        return ng1.average() == ng2.average();
    }
}
