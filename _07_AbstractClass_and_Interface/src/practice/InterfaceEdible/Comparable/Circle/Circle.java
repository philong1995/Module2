package practice.InterfaceEdible.Comparable.Circle;

import practice.InterfaceEdible.Comparable.ComparableCircle;
import practice.InterfaceEdible.Comparable.Shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
//        super phải đặt lên đầu vì quy định nó thế.
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
//        return "Circle{" +
//                "radius=" + radius +
//                '}';

//        return "A Circle with radius="
//                + getRadius()
//                + ", which is a subclass of "
//                + super.toString();
        return "A Circle area is: "+getArea();
    }

    public void resize(double percent) {
        this.radius += this.radius*(percent / 100);
    }

//    public abstract int compareTo(ComparableCircle o);
}

