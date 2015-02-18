package tdd;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ScratchTests extends TestCase {

    public void testStrings(){
        char capitalA = 'A';
        assertEquals(65, capitalA);
    }

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    public void testSortStringsInPlace() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        java.util.Collections.sort(list);
        assertEquals("Boyle", list.get(0));
        assertEquals("Camus", list.get(1));
        assertEquals("Heller", list.get(2));
        assertEquals("Kafka", list.get(3));
    }


    public void testSortedStringsInNewList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        ArrayList<String> sortedList = new ArrayList<String>(list);
        java.util.Collections.sort(sortedList);

        assertEquals("Boyle", sortedList.get(0));
        assertEquals("Camus", sortedList.get(1));
        assertEquals("Heller", sortedList.get(2));
        assertEquals("Kafka", sortedList.get(3));

        assertEquals("Heller", list.get(0));
        assertEquals("Kafka", list.get(1));
        assertEquals("Camus", list.get(2));
        assertEquals("Boyle", list.get(3));
    }

    public void testStringCompareTo() {
        assertTrue("A".compareTo("B") < 0);
        assertEquals(0, "A".compareTo("A"));
        assertTrue("B".compareTo("A") > 0);
    }

   public void testFloats() {
       System.out.println("value = " + (3 * 0.3));
   }

    public void testFizzbuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else System.out.println(i);

        }
    }

    public void testWhileFactorial() {
        int num = 3;
        int fact = 1;
        while (num > 0){
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
    }
}