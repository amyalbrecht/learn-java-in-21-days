package com.java21days.day06;

public class Zipcode {
    private String zipcode;

    public Zipcode() {
        this.zipcode = "";
    }

    public void setZipcode(String inZipcode) {
        if ((inZipcode.length() == 5) | (inZipcode.length() == 9)) {
            zipcode = inZipcode;
        }
    }

    public String getZipcode() {
        return zipcode;
    }

    public static void main(String[] arguments) {
        Zipcode zip1 = new Zipcode();
        zip1.setZipcode("55437");
        Zipcode zip2 = new Zipcode();
        zip2.setZipcode("1234567");
        if (!"".equals(zip1.getZipcode())) {
            System.out.println("Zipcode1 is " + zip1.getZipcode());
        } else {
            System.out.println("Zipcode1 not set");
        }
        if (!"".equals(zip2.getZipcode())) {
            System.out.println("Zipcode2: " + zip2.getZipcode());
        } else {
            System.out.println("Zipcode2 not set");
        }
    }
    }
