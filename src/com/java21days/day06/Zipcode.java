package com.java21days.day06;

public class Zipcode {
    private int zipcode;

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public static void main(String[] arguments) {
        Zipcode zip = new Zipcode();

        zip.setZipcode(55437);

        Integer z = 55437;
        String zipString = Integer.toString(z);

        if (zipString.length() == 5) {
            System.out.println("The zipcode is " + z);
        } else {
            System.out.println("You got the wrong number of digits, buddy.");
        }

    }



}
