
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b)        { return b + a; }
    public int subtract(int a, int b)   { return - b + a; }
    public int multiply(int a, int b)   { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }
}
