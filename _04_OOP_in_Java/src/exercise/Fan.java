package exercise;

import static exercise.Fan.FAST;
import static exercise.Fan.MEDIUM;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Speed: " + getSpeed() + "\nColor: "+getColor() + "\nRadius: "+ getRadius() + "\nfan is on";
        } else return "Speed: " + getSpeed() + "\nColor: "+getColor() + "\nRadius: "+ getRadius() + "\nfan is off";
    }
}
public class Application {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println("Fan");
        System.out.println(fan.toString() + "\n");

        Fan fan1 = new Fan();
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        System.out.println("Fan 1");
        System.out.println(fan1.toString());
    }
}