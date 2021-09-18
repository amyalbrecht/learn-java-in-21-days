package com.java21days.day01;

class
MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        opportunity.status = "driving";
        opportunity.speed = 3;
        opportunity.temperature = -50;

        System.out.println("====================");
        System.out.println("Spirit");
        System.out.println("====================");
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("====================");
        System.out.println("Opportunity");
        System.out.println("====================");
        opportunity.showAttributes();
    }
}