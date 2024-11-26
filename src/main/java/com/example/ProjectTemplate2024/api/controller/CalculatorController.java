package com.example.ProjectTemplate2024.api.controller;

import com.example.ProjectTemplate2024.api.component.CalculatorComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorComponent calculatorComponent;

    @GetMapping(value = "/add", produces = MediaType.TEXT_PLAIN_VALUE)
    public String add(@RequestParam double num1, @RequestParam double num2) {
        return String.valueOf(calculatorComponent.add(num1, num2));
    }

    @PostMapping(value = "/subtract", produces = MediaType.TEXT_PLAIN_VALUE)
    public String subtract(@RequestParam double num1, @RequestParam double num2) {
        return String.valueOf(calculatorComponent.subtract(num1, num2));
    }

    @GetMapping(value = "/divide", produces = MediaType.TEXT_PLAIN_VALUE)
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return num2 != 0 ? String.valueOf(calculatorComponent.divide(num1, num2)) : "Error: Division by zero";
    }

    @GetMapping(value = "/multiply", produces = MediaType.TEXT_PLAIN_VALUE)
    public String multiply(@RequestParam double num1, @RequestParam double num2) {
        return String.valueOf(calculatorComponent.multiply(num1, num2));
    }

    @GetMapping(value = "/sqrt", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sqrt(@RequestParam double num) {
        return num >= 0 ? String.valueOf(calculatorComponent.sqrt(num)) : "Error: Negative input";
    }
}
