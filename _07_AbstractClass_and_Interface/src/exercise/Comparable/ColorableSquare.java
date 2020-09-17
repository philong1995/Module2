package exercise.Comparable;

import practice.InterfaceEdible.Comparable.Shape.Shape;
import practice.InterfaceEdible.Comparable.Circle.Circle;
import practice.InterfaceEdible.Comparable.Rectangle.Rectangle;
import practice.InterfaceEdible.Comparable.Square.Square;

public class ColorableSquare {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,3);
        shapes[2] = new Square(3);
        for (Shape square : shapes) {
            if (square instanceof Square) {
//                Colorable a = (Square) square;
                ((Colorable) square).howToColor();
            } else {
                System.out.println(square);
            }
        }
    }
}
