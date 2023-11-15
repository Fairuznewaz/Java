package com.izaan;

public class Factorial {

    public int factorial(int number) {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }
}

