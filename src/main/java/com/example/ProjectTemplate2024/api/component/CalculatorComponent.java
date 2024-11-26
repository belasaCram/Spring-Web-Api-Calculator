package com.example.ProjectTemplate2024.api.component;

import org.springframework.stereotype.Component;

@Component
public class CalculatorComponent {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }
}
