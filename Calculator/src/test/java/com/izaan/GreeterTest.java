package com.izaan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreeterTest {

    @Test
    public void testGreet() {
        Greeter greeter = new Greeter();
        Assert.assertEquals(greeter.greet("John"), "Hello, John!");
    }
}
