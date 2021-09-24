package com.java21days.day04;

public class NumberExercise {

    public static void main(String[] arguments) {
        long[] outputNumbers = new long[10];

        System.out.print("outputNumbers[] = [ ");
        if (arguments.length > 0) {
            int i;
            for (i = 0; i < arguments.length; i++) {
                {
                    switch (arguments[i]) {
                        case "one":
                            outputNumbers[i] = 1L;
                            break;
                        case "two":
                            outputNumbers[i] = 2L;
                            break;
                        case "three":
                            outputNumbers[i] = 3L;
                            break;
                        case "four":
                            outputNumbers[i] = 4L;
                            break;
                        case "five":
                            outputNumbers[i] = 5L;
                            break;
                        case "six":
                            outputNumbers[i] = 6L;
                            break;
                        case "seven":
                            outputNumbers[i] = 7L;
                            break;
                        case "eight":
                            outputNumbers[i] = 8L;
                            break;
                        case "nine":
                            outputNumbers[i] = 9L;
                            break;
                        case "ten":
                            outputNumbers[i] = 10L;
                            break;

                    }
                    System.out.print(outputNumbers[i] + " ");
                }
            }
        }
        System.out.print("]");
    }
}
