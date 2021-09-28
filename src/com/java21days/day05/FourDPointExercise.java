package com.java21days.day05;

import java.awt.Point;

class FourDPointExercise extends Point {
    int z;
    int t;
    String name;

    FourDPointExercise(int x, int y, int z, int t, String name) {
        super(x, y);
        this.z = z;
        this.t = t;
        this.name = name;
    }

    public static void main(String[] arguments) {
        FourDPointExercise fd = new FourDPointExercise(1, 2, 3, 4, "FourDPoint");
        System.out.println("x is " + fd.x);
        System.out.println("y is " + fd.y);
        System.out.println("z is " + fd.z);
        System.out.println("t is " + fd.t);
        System.out.println("Name is " + fd.name);

    }
}
