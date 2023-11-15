package com.izaan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.factorial(5), 120);
    }
}
