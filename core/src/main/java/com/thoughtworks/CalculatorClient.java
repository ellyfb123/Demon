package com.thoughtworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by fxie on 7/15/14.
 */
public class CalculatorClient {
    private ICalculator calculator;

    public String add(String add1, String add2) {
        String addresult1 = calculator.add(add1, add2);
        return addresult1;
    }
    @Autowired
    public void setCalculator(ICalculator Calculator) {
       this.calculator = Calculator;

    }
}
