import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelloWorldTest{
    @Test
    public void shouldGetHello(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayhello();
        assertEquals("HelloWorld", result);
    }

}