package com.java21days.day03;

import java.awt.*;

class RefTester {
    public static void main(String[] arguments) {
        Point pt1, pt2;
        pt1 = new Point(100, 190);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 290;
        pt2.x = 300;
        pt2.y = 390;
        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
    }
}
