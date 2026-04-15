package com.example;

public class PayrollService {

    public double calculateSalary(double base, double bonus, double deductions) {
        return base + bonus - deductions;
    }

    public static void main(String[] args) {
        PayrollService service = new PayrollService();
        double salary = service.calculateSalary(50000, 5000, 2000);
        System.out.println("Final Salary: " + salary);
    }
}