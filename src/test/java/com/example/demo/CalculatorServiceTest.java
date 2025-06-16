
package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calc = new CalculatorService();

    @Test
    void addition() {
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
