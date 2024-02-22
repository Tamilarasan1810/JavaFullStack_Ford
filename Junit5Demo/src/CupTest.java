import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquitType() {
        Cup c = new Cup("orange juice",85.5);
        assertEquals("orange juice",c.getLiquitType());
    }

    @Test
    void getPercentageFull(){
        Cup c = new Cup("orange juice",85.5);
        assertEquals(85.5,c.getPrecentFull() );
    }
}