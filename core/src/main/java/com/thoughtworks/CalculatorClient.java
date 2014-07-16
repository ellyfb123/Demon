package com.thoughtworks;

/**
 * Created by fxie on 7/15/14.
 */
public class CalculatorClient {
    private ICalculator calculator;
    public void setCalculator(ICalculator Calculator) {
        calculator = Calculator;

    }
    public String add(String add1, String add2) {
        String addresult1 = calculator.add(add1, add2);
        return addresult1;
    }
}
