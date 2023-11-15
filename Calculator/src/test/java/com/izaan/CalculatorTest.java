package com.izaan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(5, 3), 8);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5,3),15 );
    }
}
