package exercise;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number USD: ");
        USD = scanner.nextDouble();
        double converter = USD*23000;
        System.out.println("The value is converted from USD to VND: "+converter);
    }
}
