package practice.InterfaceEdible.Comparable.Square;

import exercise.Comparable.Colorable;
import practice.InterfaceEdible.Comparable.Rectangle.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square(){

    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {

        setSide(getSide() + getSide()*(percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}