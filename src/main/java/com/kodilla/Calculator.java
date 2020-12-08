package com.kodilla;

public class Calculator {

    public void calculaotrAddMethod() {
        int add1 = 5;
        int add2 = 10;

        System.out.println("Add: " + (add1 + add2));
    }

    public void calculatorSubstractMethod() {
        double substract1 = 1.8;
        double substract2 = 0.8;

        System.out.println("Syubstract: " + (substract1 - substract2));
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculaotrAddMethod();
        calculator.calculatorSubstractMethod();
    }
}


