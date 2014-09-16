package tests;

import junit.framework.TestCase;

public class ScratchTests extends TestCase {

    public void testStrings(){
        char capitalA = 'A';
        assertEquals(65, capitalA);
    }

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    public void testDollarMutability(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(5,five.amount);
    }

    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse((new Dollar(5).equals(new Dollar(6))));
    }
}
