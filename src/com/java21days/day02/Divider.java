package com.java21days.day02;

public class Divider {
    public static void main(String[] arguments) {
        float x = 20;
        float y = 6;
        float totalDivision;
        float totalModulus;


        // Display 2 numbers
        System.out.println("x = " + x + "\ny = " + y);

        totalDivision = x / y;
        totalModulus = x % y;

        // Display result and remainder
        System.out.println("Result is: " + totalDivision + "\tRemainder is: " + totalModulus);

    }
}
