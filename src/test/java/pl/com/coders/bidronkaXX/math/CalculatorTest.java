package pl.com.coders.bidronkaXX.math;

import org.junit.jupiter.api.Test;

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
}