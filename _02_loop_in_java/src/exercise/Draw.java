package exercise;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        int n;
        int m;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the rectangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your triangle height: ");
                    n = input.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Enter your rectangle height: ");
                    n = input.nextInt();
                    System.out.println("Enter your rectangle length: ");
                    m = input.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Enter your triangle height: ");
                    n = input.nextInt();
                    for (int r = 1; r <= n; r++) {
                        for (int sp = 1; sp <= n - r; sp++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 2*r-1; j++) {
                            System.out.print(" "+"*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4 :
                    System.exit(0);
            }
        }
    }
}