package exercise.PointAndMovablePoint;

public class App {
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(0);
        point.setY(3);
        System.out.println("Point : " + point.toString());

        point.setXY(0, 4);
        System.out.println("Point : " + point.toString());

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(2);

        movablePoint.move();
        //Example x= 0+3; y = 4+2;
        System.out.println(movablePoint.toString());

    }
}
