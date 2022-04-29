package com.practice;

import java.util.Calendar;

public class Calculator {
    public int add (final int a, final int b) {
        return a+b;
    }

    public static  void main(String args[]) {
        final Calculator cal = new Calculator();
        System.out.println(cal.add(1,2));
    }
}
