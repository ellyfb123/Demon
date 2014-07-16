package com.thoughtworks;

/**
 * Created by fxie on 7/14/14.
 */
abstract public class AbstractCalculator implements ICalculator {

    public String verify(String add1,String add2) {
        try {
            int add1Int = Integer.parseInt(add1);
            int add2Int = Integer.parseInt(add2);
        }
        catch (NumberFormatException ex){
            return "ERROR";
        }
        int add1Int = Integer.parseInt(add1);
        int add2Int = Integer.parseInt(add2);
        if (add1Int >= 100 || add2Int >= 100 || add1Int <0 ||add2Int<0)
        {return "ERROR";}
        else
            return "RIGHT";
    }


}
