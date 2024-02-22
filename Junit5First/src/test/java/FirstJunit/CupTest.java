package FirstJunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquitType() {
        Cup c = new Cup("orange juice",85.5);
        assertEquals(85,85);
    }
    @Test
    void getPercentageFull(){
        Cup c = new Cup("orange juice",85.5);
        assertEquals(85.5,c.getPrecentFull() );
    }
}