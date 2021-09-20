package com.java21days.day02;

public class Investor {
    public static void main(String[] arguments) {
        // Initial investment
        double investment = 14000;

        System.out.println("$" + investment + " is the initial investment.");

        // During the first year, investment increases by 40%
        investment = investment * 1.4;
        System.out.println("$" + investment + " is the total after the first year.");

        // During the second year, investment decreases by $1,500
        investment = investment - 1500;
        System.out.println("$" + investment + " is the total after the second year.");

        // During the third year, investment increases by 12%
        investment = investment * 1.12;
        System.out.println("$" + investment + " is the total after the third year.");

        // And an if statement with a boolean for fun
        if (investment > 20000) {
            System.out.println("Looks like a decent investment.");
        }

    }
}
