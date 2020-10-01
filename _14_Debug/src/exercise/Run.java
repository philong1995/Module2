package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void loop(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter egde a: ");
            int a = scanner.nextInt();
            System.out.println();
            System.out.print("Enter egde b: ");
            int b = scanner.nextInt();
            System.out.println();
            System.out.print("Enter edge c: ");
            int c = scanner.nextInt();
            System.out.println();

            new IllegalTriangleException(a,b,c);
        }catch (IllegalTriangleException e){
            System.out.println("This is not a Triangle.Please enter again. "+e.getMessage());
            loop();
        }catch (InputMismatchException e){
            System.out.println("Don't enter a character.Please enter again. ");
            loop();
        }
    }
    public static void main(String[] args) {
        loop();
    }
}
