package exercise.ResizeAble;

import practice.InterfaceEdible.Comparable.Shape.Shape;
import practice.InterfaceEdible.Comparable.Circle.Circle;
import practice.InterfaceEdible.Comparable.Rectangle.Rectangle;
import practice.InterfaceEdible.Comparable.Square.Square;

public class App {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "green", false);
        shapes[1] = new Rectangle(x, x, "yellow", true);
        shapes[2] = new Square(x, "red", true);
        for (Shape a : shapes){
            System.out.println(a);
        }
        System.out.println("\n");
        System.out.println("After resize: ");

        for (Shape a : shapes) {
            a.resize(Math.random() * 100);
            System.out.println(a);
        }
    }
}
