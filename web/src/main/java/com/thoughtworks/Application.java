package com.thoughtworks;

/**
 * Created by fxie on 7/15/14.
 */
public class Application {
    public static void main(String[] args){
        ICalculator mathCalculator = new MathCalculator();
        ICalculator linkCalculator = new LinkCalculator();
        CalculatorClient calculatorManger = new CalculatorClient();
        calculatorManger.setCalculator(mathCalculator);
        System.out.println(calculatorManger.add("12", "23"));
        calculatorManger.setCalculator(linkCalculator);
        System.out.println(calculatorManger.add("12", "23"));
    }
}
