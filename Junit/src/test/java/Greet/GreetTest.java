package Greet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {
    @Test
    public void testGreet()
    {
        Greet greet = new Greet();
        String actual = greet.greet("hey");
        assertEquals("hey",actual);
    }

}