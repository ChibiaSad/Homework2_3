package com.example.calculator.servise;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(int num1, int num2){
        return num1 + num2;
    }

    public int minus(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Деление на 0");
        }
        return (double) num1 / num2;
    }
}
