package com.java21days.day05;

import java.awt.Point;

class Box2 {
    int x1, y1, x2, y2 = 0;

    Box2(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box2(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    Box2(Point topLeft, int w, int h) {
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
    }

    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] arguments) {
        Box2 rect;

        System.out.println("Calling Box2 with coordinates (13,35) and (10,40):");
        rect = new Box2(13, 35, 10, 40);
        rect.printBox();

        System.out.println("\nCalling Box2 with points (9,27) and (17,19):");
        rect = new Box2(new Point(9,27), new Point(17,19));
        rect.printBox();

        System.out.println("\nCalling Box2 with 1 point (5,40), width 22, and height 20:");
        rect = new Box2(new Point(5,40), 22, 20);
        rect.printBox();
    }
}
