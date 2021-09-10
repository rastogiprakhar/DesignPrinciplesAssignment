package com.prakhar.OCP;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calci = new Calculator();
        Addition add = new Addition(10,15);
        Subtraction sub = new Subtraction(20,30);
        Multiplication mul = new Multiplication(40,50);
        calci.calculate(add);
        System.out.println("Addition of both number is:  "+add.sum);
        calci.calculate(sub);
        System.out.println("Subtraction of both number is:  "+sub.difference);
        calci.calculate(mul);
        System.out.println("Multiplication of both number is:  "+mul.product);
    }
}
