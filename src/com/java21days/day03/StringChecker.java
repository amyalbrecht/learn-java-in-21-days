package com.java21days.day03;

import java.util.Locale;

class StringChecker {
    public static void main(String[] arguments) {
        String str = "You know nothing, Jon Snow";
        System.out.println("The string is: " + str);
        System.out.println("Length of this string: " + str.length());
        System.out.println("The character at position 7: " + str.charAt(7));
        System.out.println("The substring from 9 to 16: " + str.substring(9, 16));
        System.out.println("The index of the first 'w': " + str.indexOf('w'));
        System.out.println("The index of the beginning of the substring \"Jon\": " + str.indexOf("Jon"));
        System.out.println("The string in uppercase: " + str.toUpperCase());
    }
}
