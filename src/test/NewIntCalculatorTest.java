package test;

import laborator6_starter_src.src.main.java.ro.ulbs.proiectaresoftware.lab6.advanced.NewIntCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest {

    private NewIntCalculator calc;

    @BeforeEach
    public void setup() {
        calc = new NewIntCalculator();
        calc.init();
    }

    @Test
    public void testAddPositive() {
        calc.add(5).add(3);
        Assertions.assertEquals(8, calc.getState());
    }

    @Test
    public void testAddNegatives() {
        calc.add(-5).add(-3);
        Assertions.assertEquals(-8, calc.getState());
    }

    @Test
    public void testSubtractPositives() {
        calc.add(10).subtract(4);
        Assertions.assertEquals(6, calc.getState());
    }

    @Test
    public void testSubtractNegatives() {
        calc.add(-10).subtract(-4);
        Assertions.assertEquals(-6, calc.getState());
    }

    @Test
    public void testMultiplyPositives() {
        calc.add(4).multiply(3);
        Assertions.assertEquals(12, calc.getState());
    }

    @Test
    public void testMultiplyNegatives() {
        calc.add(-4).multiply(-3);
        Assertions.assertEquals(12, calc.getState());
    }

    @Test
    public void testMultiplyBy0() {
        calc.add(5).multiply(0);
        Assertions.assertEquals(0, calc.getState());
    }

    @Test
    public void testDividePositives() {
        calc.add(10).divide(2);
        Assertions.assertEquals(5, calc.getState());
    }

    @Test
    public void testDivideNegatives() {
        calc.add(-10).divide(-2);
        Assertions.assertEquals(5, calc.getState());
    }

    // EXERCITIUL 2
    @Test
    public void testDivideBy0() {
        calc.add(10);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(0);
        });
    }
}