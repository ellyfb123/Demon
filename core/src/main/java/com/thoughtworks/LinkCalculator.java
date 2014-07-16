package com.thoughtworks;

/**
 * Created by fxie on 7/10/14.
 */
public class LinkCalculator extends AbstractCalculator {
    @Override
    public String add(String add1, String add2) {
        String verifyResult = this.verify(add1, add2);
        if (!verifyResult.equals("ERROR"))
        {return add1 + add2;}
        else
        return "ERROR";
    }
}
