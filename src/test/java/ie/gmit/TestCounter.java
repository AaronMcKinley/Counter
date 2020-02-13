package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCounter {

    private Counter myCounter;

    @BeforeEach
    void setUpClass(){
        myCounter = new Counter();
    }
    @Test
    void testConstructor(){
        assertEquals(myCounter.count, myCounter.getCount());
    }
    @Test
    void testIncrement(){
        assertEquals(myCounter.incrementCount()+1, myCounter.incrementCount());
    }
    @Test
    void testDecrement(){
        assertEquals(myCounter.decrementCount()-1, myCounter.decrementCount());
    }
    @Test
    void testGreaterThan(){
        Counter aCounter = new Counter(3);
    }
}
