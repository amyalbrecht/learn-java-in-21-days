package com.java21days.day04;

public class YearExercise {

    public static void main(String[] arguments) {
        int yearIn = 2020;
        if (arguments.length > 0) {
            yearIn = Integer.parseInt(arguments[0]);
        }

        int i;
        int j;
        for (i = 1; i < 13; i++) {
            for (j = 1; j <= countDays(i, yearIn); j++) {
                System.out.println(monthPrinter(i) + " " + j);
            }
        }
        System.out.println();
    }

    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                if ((year % 100 == 0) & (year % 400 != 0)) {
                    count = 28;
                }
        }
        return count;
    }
    static String monthPrinter(int month){
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
        return monthString;
    }
}


