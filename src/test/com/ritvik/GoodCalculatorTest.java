package test.com.ritvik;

import com.ritvik.GoodCalculator;

import static org.junit.Assert.*;

public class GoodCalculatorTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        GoodCalculator tester = new GoodCalculator();
        assertEquals("Value should be 3",3,tester.add(1,2));
    }

    @org.junit.Test
    public void testSubstract() throws Exception {
        GoodCalculator tester = new GoodCalculator();
        assertEquals("Value should be 2",2,tester.substract(3,1));
    }

    @org.junit.Test
    public void testMultiply() throws Exception {
        GoodCalculator tester = new GoodCalculator();
        assertEquals("Value should be 3",3,tester.multiply(3,1));
    }
}