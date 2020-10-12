package controllers;

import models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookingCinema {
    static MainControllers mainControllers = new MainControllers();
    static Scanner scanner = new Scanner(System.in);
    static Queue<Customer> queue = new LinkedList<>();
    public static void addTicket() {
        String input;
        do {
            System.out.println("1. Booking Cinema. \n" +
                    "2. Show infor customer booking. \n" +
                    "3. Back to menu. \n" +
                    "4. Exit.");
            System.out.println("-------------------------");
            System.out.print("Enter your choose: ");
            input = scanner.nextLine();
            switch (Integer.parseInt(input)) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    showTicketBooked();
                    break;
                case 3:
                    mainControllers.menu();
                    break;
                case 4:
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("No empty.Choose a number again.");
                    System.out.println("-------------------------");
            }
        }while (Integer.parseInt(input) > 0 || Integer.parseInt(input) < 5);
    }
    public static void bookTicket(){
        mainControllers.showInfoCustomer();
        System.out.print("Choose customer want booking: ");
        String chooseCustomer = scanner.nextLine();
        queue.add(MainControllers.customerList.get(Integer.parseInt(chooseCustomer) - 1));
        System.out.println("Booking done!!!");
    }
    public static void showTicketBooked(){
        System.out.print("Customer was booking: ");
        if (queue.isEmpty()){
            System.out.println("List is empty.");
        } else {
            for (int i = 0; i < queue.size(); i++){
                System.out.println(queue.peek());
            }
        }
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        addTicket();
    }
}
