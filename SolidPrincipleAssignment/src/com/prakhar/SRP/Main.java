package com.prakhar.SRP;

public class Main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Prakhar Rastogi");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_Code_Example"));
        textPrinter.printOutEachWordOfText();
    }
}
