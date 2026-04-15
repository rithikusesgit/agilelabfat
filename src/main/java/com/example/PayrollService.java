package com.example;

public class PayrollService {

    public double calculateSalary(double base, double bonus, double deductions) {
        return base + bonus - deductions;
    }
}