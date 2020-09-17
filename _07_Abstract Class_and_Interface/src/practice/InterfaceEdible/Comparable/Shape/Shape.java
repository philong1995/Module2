package practice.InterfaceEdible.Comparable.Shape;

import exercise.ResizeAble.Resizeable;

public abstract class Shape implements Resizeable{
    private String color = "red";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape {" +
                "color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }

//    public void resize(double v) {
//    }
}
