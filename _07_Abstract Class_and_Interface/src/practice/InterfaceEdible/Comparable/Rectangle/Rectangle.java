package practice.InterfaceEdible.Comparable.Rectangle;

import practice.InterfaceEdible.Comparable.Shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width*this.length;
    }

    public double getPerimeter() {
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
//        return "Rectangle{" +
//                "width=" + width +
//                ", length=" + length +
//                '}';
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {
        this.length *= (percent / 100);
        this.width += (percent / 100);
    }
}
