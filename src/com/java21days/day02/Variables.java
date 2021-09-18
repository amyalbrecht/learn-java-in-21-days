package com.java21days.day02;

public class Variables {
    public static void main(String[] arguments) {
        final char UP = 'U';
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;

        System.out.println("You have reached level " + initialLevel
                + " with a score of " + score + " at location " + location + ".");
        System.out.println("Press " + UP + " to go up.");
        System.out.println("Is this a new game? " + newGame);
    }
}
