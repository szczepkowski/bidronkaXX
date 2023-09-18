package pl.com.coders.bidronkaXX.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int add = calculator.add(500, 502);

        assertEquals(1002, add);
    }

    @Test
    void addSmallNumber() {
        Calculator calculator = new Calculator();
        int add = calculator.add(0, 1);

        assertEquals(1, add);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int sum = calculator.multiply(2, 2);

        assertEquals(4, sum);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        float divide = calculator.divide(10, 3);

        assertEquals(3.3333332538604736, divide);
    }

    @Test
    void testAdd() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        Calculator calculator = new Calculator();
        int add = calculator.add(ints);

        assertEquals(6, add);
    }

    @Test
    void testAddMany() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }

        Calculator calculator = new Calculator();
        int add = calculator.add(ints);

        assertEquals(4950, add);
    }
}