package exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return r2;
    }
}
class Application {
    public static void main(String[] args) {
        System.out.println("The quadratic equation is: ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
//        System.out.println(" ");
        System.out.print("b: ");
        double b = scanner.nextDouble();
//        System.out.println(" ");
        System.out.print("c: ");
        double c = scanner.nextDouble();
        QuadraticEquation qE = new QuadraticEquation(a, b, c);
        double delta = qE.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no root");
        } else if (delta == 0) {
            System.out.println("The equation has 1 root is: " + qE.getRoot1());
        } else {
            System.out.println("The equation has 2 root is: " + qE.getRoot1() + " and " + qE.getRoot2());
        }
    }
}
