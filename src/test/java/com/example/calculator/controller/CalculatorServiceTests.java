package com.example.calculator.controller;

import com.example.calculator.servise.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldReturnSum() {
        int a = 50, b = 64;
        int c = 60, d = -72;
        assertEquals(a + b, calculatorService.plus(a, b));
        assertEquals(c + d, calculatorService.plus(c, d));
    }

    @Test
    public void shouldReturnDifference() {
        int a = 50, b = 64;
        int c = 60, d = -72;
        assertEquals(a - b, calculatorService.minus(a, b));
        assertEquals(c - d, calculatorService.minus(c, d));
    }

    @Test
    public void shouldReturnMultiplication() {
        int a = 50, b = 64;
        int c = 60, d = -72;
        assertEquals(a * b, calculatorService.multiply(a, b));
        assertEquals(c * d, calculatorService.multiply(c, d));
    }

    @Test
    public void shouldReturnDivision() {
        int a = 50, b = 64;
        int c = 60, d = 3;
        assertEquals((double) a / b, calculatorService.divide(a, b));
        assertEquals((double) c / d, calculatorService.divide(c, d));
    }

    @Test
    public void shouldThrowIllegalArgumentException(){
        int a = 50, b = 0;
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(a, b));
    }
}
