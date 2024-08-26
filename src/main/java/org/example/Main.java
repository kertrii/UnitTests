package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(3);
        System.out.println("Сума чисел від 1 до 3 дорівнює " + result);
    }
}

