package com.java21days.day03;

public class SampleExerciseApp {
    public static void main(String[] arguments) {
        SampleExercise box = new SampleExercise();
        box.height = 10;
        box.weight = 6;
        box.depth = 4;

        System.out.println("Box dimensions:");
        System.out.println("Height: " + box.height + " in");
        System.out.println("Weight: " + box.weight + " lbs");
        System.out.println("Depth: " + box.depth + " in");

    }
}
