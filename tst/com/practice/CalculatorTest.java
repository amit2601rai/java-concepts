package com.practice;

import org.junit.Test;

class CalculatorTest {

    @Test
    public void test() {
        final Calculator calculator = new Calculator();
        System.out.println(calculator.add(3, 5));
    }

}