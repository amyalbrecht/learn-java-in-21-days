package com.java21days.day03;

import java.util.StringTokenizer;

public class BirthdayExercise {

    public static void main(String[] arguments) {
        StringTokenizer st1;

        String birthday = "04/04/2018";
        st1 = new StringTokenizer(birthday, "/");
        System.out.println("Month: " + st1.nextToken());
        System.out.println("Day: " + st1.nextToken());
        System.out.println("Year: " + st1.nextToken());

    }
}