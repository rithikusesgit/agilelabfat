package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PayrollServiceTest {

    @Test
    void testSalaryCalculation() {
        PayrollService service = new PayrollService();
        assertEquals(53000, service.calculateSalary(50000, 5000, 2000));
    }
}