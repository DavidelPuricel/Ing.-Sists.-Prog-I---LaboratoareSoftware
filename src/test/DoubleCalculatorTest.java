package test;

import laborator6_starter_src.src.main.java.ro.ulbs.proiectaresoftware.lab6.advanced.DoubleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {

    private DoubleCalculator calc;

    @BeforeEach
    public void setup() {
        calc = new DoubleCalculator();
        calc.init();
    }

    @Test
    public void testAddPositive() {
        calc.add(5.5).add(2.5);
        Assertions.assertEquals(8.0, calc.getState(), 0.0001);
    }

    @Test
    public void testAddNegatives() {
        calc.add(-5.5).add(-2.5);
        Assertions.assertEquals(-8.0, calc.getState(), 0.0001);
    }

    @Test
    public void testSubtractPositives() {
        calc.add(10.5).subtract(2.5);
        Assertions.assertEquals(8.0, calc.getState(), 0.0001);
    }

    @Test
    public void testSubtractNegatives() {
        calc.add(-10.5).subtract(-2.5);
        Assertions.assertEquals(-8.0, calc.getState(), 0.0001);
    }

    @Test
    public void testMultiplyPositives() {
        calc.add(2.0).multiply(3.0);
        Assertions.assertEquals(6.0, calc.getState(), 0.0001);
    }

    @Test
    public void testMultiplyNegatives() {
        calc.add(-2.0).multiply(-3.0);
        Assertions.assertEquals(6.0, calc.getState(), 0.0001);
    }

    @Test
    public void testMultiplyBy0() {
        calc.add(5.5).multiply(0.0);
        Assertions.assertEquals(0.0, calc.getState(), 0.0001);
    }

    @Test
    public void testDividePositives() {
        calc.add(10.0).divide(2.0);
        Assertions.assertEquals(5.0, calc.getState(), 0.0001);
    }

    @Test
    public void testDivideNegatives() {
        calc.add(-10.0).divide(-2.0);
        Assertions.assertEquals(5.0, calc.getState(), 0.0001);
    }

    // EXERCITIUL 2
    @Test
    public void testDivideBy0() {
        calc.add(10.0);
        calc.divide(0.0);

        Assertions.assertEquals(Double.POSITIVE_INFINITY, calc.getState());
    }
}