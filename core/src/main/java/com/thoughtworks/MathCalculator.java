package com.thoughtworks;

/**
 * Created by fxie on 7/10/14.
 */
public class MathCalculator extends AbstractCalculator {
    @Override
    public String add(String add1, String add2) {
        String verifyResult = this.verify(add1, add2);
        if (!verifyResult.equals("ERROR")) {
            int num1 = Integer.parseInt(add1) + Integer.parseInt(add2);
            return String.valueOf(num1);
        }
        else
            return "ERROR";
    }
}

