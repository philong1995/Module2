package exercise;

import java.util.Scanner;

public class ConverterNumberToText {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number");
        int n = scanner.nextInt();
        int tr = n / 100;
        int ch = (n % 100) / 10;
        int dv = n % 10;

        if ((tr == 1) && (ch == 0) && (dv == 0))
            System.out.println("one hundred");
        else if ((tr == 2) && (ch == 0) && (dv == 0))
            System.out.println("two hundred");
        else if ((tr == 3) && (ch == 0) && (dv == 0))
            System.out.println("three hundred");
        else if ((tr == 4) && (ch == 0) && (dv == 0))
            System.out.println("four hundred");
        else if ((tr == 5) && (ch == 0) && (dv == 0))
            System.out.println("five hundred");
        else if ((tr == 6) && (ch == 0) && (dv == 0))
            System.out.println("six hundred");
        else if ((tr == 7) && (ch == 0) && (dv == 0))
            System.out.println("seven hundred");
        else if ((tr == 8) && (ch == 0) && (dv == 0))
            System.out.println("eight hundred");
        else if ((tr == 9) && (ch == 0) && (dv == 0))
            System.out.println("nine hundred");

        else if ((tr == 0) && (ch == 1) && (dv == 0))
            System.out.println("ten");
        else if ((tr == 0) && (ch == 1) && (dv == 1))
            System.out.println("eleven");
        else if ((tr == 0) && (ch == 1) && (dv == 2))
            System.out.println("twelve");
        else if ((tr == 0) && (ch == 1) && (dv == 3))
            System.out.println("thirteen");
        else if ((tr == 0) && (ch == 1) && (dv == 4))
            System.out.println("forteen");
        else if ((tr == 0) && (ch == 1) && (dv == 5))
            System.out.println("fifteen");
        else if ((tr == 0) && (ch == 1) && (dv == 6))
            System.out.println("sixteen");
        else if ((tr == 0) && (ch == 1) && (dv == 7))
            System.out.println("seventeen");
        else if ((tr == 0) && (ch == 1) && (dv == 8))
            System.out.println("eighteen");
        else if ((tr == 0) && (ch == 1) && (dv == 9))
            System.out.println("nineteen");

        else if ((tr == 0) && (ch == 2) && (dv == 0))
            System.out.println("twenty");
        else if ((tr == 0) && (ch == 3) && (dv == 0))
            System.out.println("thirty");
        else if ((tr == 0) && (ch == 4) && (dv == 0))
            System.out.println("forty");
        else if ((tr == 0) && (ch == 5) && (dv == 0))
            System.out.println("fifty");
        else if ((tr == 0) && (ch == 6) && (dv == 0))
            System.out.println("sixty");
        else if ((tr == 0) && (ch == 7) && (dv == 0))
            System.out.println("seventy");
        else if ((tr == 0) && (ch == 8) && (dv == 0))
            System.out.println("eighty");
        else if ((tr == 0) && (ch == 9) && (dv == 0))
            System.out.println("ninety");

        else if ((tr == 0) && (ch == 0) && (dv == 0))
            System.out.println("zero");
        else if ((tr == 0) && (ch == 0) && (dv == 1))
            System.out.println("one");
        else if ((tr == 0) && (ch == 0) && (dv == 2))
            System.out.println("two");
        else if ((tr == 0) && (ch == 0) && (dv == 3))
            System.out.println("three");
        else if ((tr == 0) && (ch == 0) && (dv == 4))
            System.out.println("four");
        else if ((tr == 0) && (ch == 0) && (dv == 5))
            System.out.println("five");
        else if ((tr == 0) && (ch == 0) && (dv == 6))
            System.out.println("six");
        else if ((tr == 0) && (ch == 0) && (dv == 7))
            System.out.println("seven");
        else if ((tr == 0) && (ch == 0) && (dv == 8))
            System.out.println("eight");
        else if ((tr == 0) && (ch == 0) && (dv == 9))
            System.out.println("nine");

        else {
            switch (tr) {
                case 1 :
                    System.out.print("one hundred ");
                    break;
                case 2 :
                    System.out.print("two hundred ");
                    break;
                case 3 :
                    System.out.print("three hundred ");
                    break;
                case 4 :
                    System.out.print("four hundred ");
                    break;
                case 5 :
                    System.out.print("five hundred ");
                    break;
                case 6 :
                    System.out.print("six hundred ");
                    break;
                case 7 :
                    System.out.print("seven hundred ");
                    break;
                case 8 :
                    System.out.print("eight hundred ");
                    break;
                case 9 :
                    System.out.print("nine hundred ");
                    break;
            }
            switch (ch) {
                case 0 :
                    System.out.print("and ");
                    break;
                case 1 :
                    System.out.print("ten ");
                    break;
                case 2 :
                    System.out.print("twenty ");
                    break;
                case 3 :
                    System.out.print("thirty ");
                    break;
                case 4 :
                    System.out.print("forty ");
                    break;
                case 5 :
                    System.out.print("fifty ");
                    break;
                case 6 :
                    System.out.print("sixty ");
                    break;
                case 7 :
                    System.out.print("seventy ");
                    break;
                case 8 :
                    System.out.print("eighty ");
                    break;
                case 9 :
                    System.out.print("ninety ");
                    break;
            }
            switch (dv) {
                case 0 :
                    System.out.print("and ");
                    break;
                case 1 :
                    System.out.print("one ");
                    break;
                case 2 :
                    System.out.print("two ");
                    break;
                case 3 :
                    System.out.print("three ");
                    break;
                case 4 :
                    System.out.print("four ");
                    break;
                case 5 :
                    System.out.print("five ");
                    break;
                case 6 :
                    System.out.print("six ");
                    break;
                case 7 :
                    System.out.print("seven ");
                    break;
                case 8 :
                    System.out.print("eight ");
                    break;
                case 9 :
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
