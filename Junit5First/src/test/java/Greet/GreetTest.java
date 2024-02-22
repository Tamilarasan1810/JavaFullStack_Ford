package Greet;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    @Test
    public void greetTest(){
        Greet g = new Greet();
        String expected = "Hey, Howdy";
        String actual = g.greet("Hey, Howdy");
        assertEquals(expected,actual);
    }

}