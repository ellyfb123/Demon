package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fxie on 7/15/14.
 */
public class sayHelloTest {
    @Test
    public void shouldGetHello(){
        SayHello hello = new SayHello();
        String result = hello.say();
        assertEquals("hello", result);
    }
}
