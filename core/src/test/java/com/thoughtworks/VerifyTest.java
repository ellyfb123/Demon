package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fxie on 7/14/14.
 */
public class VerifyTest {
    @Test
    public void shouldInput100and1ThenReturnError(){
        Validator validator = new Validator();
        String result = validator.verify("100","1");
        assertEquals(result,"ERROR");
    }
    @Test
    public void shouldInputAand1ThenReturnError(){
        Validator validator = new Validator();
        String result = validator.verify("A","1");
        assertEquals(result,"ERROR");
    }
    @Test
    public void shouldInput101and100ThenReturnError(){
        Validator validator = new Validator();
        String result = validator.verify("101","100");
        assertEquals(result,"ERROR");
    }

}
