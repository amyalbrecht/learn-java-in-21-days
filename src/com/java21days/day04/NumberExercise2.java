package com.java21days.day04;

public class NumberExercise2 {
    public static void main(String[] arguments) {
        long outputNumber = 0;

        if (arguments.length > 0) {
            switch (arguments[0]) {
                case "one":
                    outputNumber = 1L;
                    break;
                case "two":
                    outputNumber = 2L;
                    break;
                case "three":
                    outputNumber = 3L;
                    break;
                case "four":
                    outputNumber = 4L;
                    break;
                case "five":
                    outputNumber = 5L;
                    break;
                case "six":
                    outputNumber = 6L;
                    break;
                case "seven":
                    outputNumber = 7L;
                    break;
                case "eight":
                    outputNumber = 8L;
                    break;
                case "nine":
                    outputNumber = 9L;
                    break;
                case "ten":
                    outputNumber = 10L;
                    break;

            }
        }
        System.out.println("The number you have typed is " + outputNumber + ".\nWhy are you typing out numbers?");
    }
}

