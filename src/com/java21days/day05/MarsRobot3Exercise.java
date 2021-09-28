package com.java21days.day05;

class MarsRobot3Exercise {
    String status;
    int speed;
    float temperature;

    MarsRobot3Exercise(String status, int speed, float temperature) {
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }

    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] arguments) {
        MarsRobot3Exercise spirit = new MarsRobot3Exercise("exploring", 2, -60);
        MarsRobot3Exercise opportunity = new MarsRobot3Exercise("driving", 3, -50);

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
