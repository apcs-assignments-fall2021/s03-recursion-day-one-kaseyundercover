import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testArithmeticSequence() {
        assertEquals(3, MyMain.arithmeticSequence(1),"The " + 1 + "-th term should be: " + 3);
        assertEquals(5, MyMain.arithmeticSequence(2),"The " + 2 + "-th term should be: " + 5);
        assertEquals(7, MyMain.arithmeticSequence(3),"The " + 3 + "-th term should be: " + 7);
        assertEquals(9, MyMain.arithmeticSequence(4),"The " + 4 + "-th term should be: " + 9);
    }

    @Test
    public void testCountX() {
        assertEquals(1, MyMain.countX("hix"),"The number of times 'x' shows up in " + "hix" + " should be: " + 1);
        assertEquals(2, MyMain.countX("xoxo"),"The number of times 'x' shows up in " + "xoxo" + " should be: " + 2);
        assertEquals(2, MyMain.countX("xhix"),"The number of times 'x' shows up in " + "xhix" + " should be: " + 2);
        assertEquals(3, MyMain.countX("xhixhix"),"The number of times 'x' shows up in " + "xhixhix" + " should be: " + 3);
    }

    @Test
    public void testExponent() {
        assertEquals(32, MyMain.exponent(2, 5),2 + "to the " + 5 + "-th power should be: " + 32);
        assertEquals(25, MyMain.exponent(5, 2),5 + "to the " + 2 + "-th power should be: " + 25);
        assertEquals(1, MyMain.exponent(4, 0),4 + "to the " + 0 + "-th power should be: " + 1);
        assertEquals(216, MyMain.exponent(6, 3),6 + "to the " + 3 + "-th power should be: " + 216);
        assertEquals(7, MyMain.exponent(7, 1),7 + "to the " + 1 + "-th power should be: " + 7);
    }

    @Test
    public void testCountHi() {
        assertEquals(1, MyMain.countHi("hix"),"The number of times \"hi\" shows up in " + "hix" + " should be: " + 1);
        assertEquals(2, MyMain.countHi("hellohihi"),"The number of times \"hi\" shows up in " + "hellohihi" + " should be: " + 2);
        assertEquals(2, MyMain.countHi("hellohibyehi"),"The number of times \"hi\" shows up in " + "hellohihi" + " should be: " + 2);
        assertEquals(1, MyMain.countHi("hihello"),"The number of times \"hi\" shows up in " + "hihello" + " should be: " + 1);
        assertEquals(0, MyMain.countHi("x"),"The number of times \"hi\" shows up in " + "x" + " should be: " + 0);
        assertEquals(1, MyMain.countHi("hi"),"The number of times \"hi\" shows up in " + "hi" + " should be: " + 1);
    }
}
