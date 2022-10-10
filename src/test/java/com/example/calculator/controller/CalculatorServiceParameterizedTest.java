package com.example.calculator.controller;

import com.example.calculator.servise.CalculatorService;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideNumbers")
    public void shouldReturnSum(int a, int b) {
        assertEquals(a + b, calculatorService.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideNumbers")
    public void shouldReturnDifference(int a, int b) {
        assertEquals(a - b, calculatorService.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideNumbers")
    public void shouldReturnMultiplication(int a, int b) {
        assertEquals(a * b, calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideNumbers")
    public void shouldReturnDivision(int a, int b) {
        assertEquals((double) a / b, calculatorService.divide(a, b));
    }

    public Stream<Arguments> provideNumbers(){
        return Stream.of(Arguments.of(15, 39),
                Arguments.of(39, 3),
                Arguments.of(12, 21));
    }
}