package Controllers;

import java.util.Scanner;

public class MainControllers {
    public static void menu() {
        System.out.println("----------------------------");
        System.out.println("1.Add New Services. \n" +
                "2.Show Services. \n" +
                "3.Add New Customer. \n" +
                "4.Show Information of Customer. \n" +
                "5.Add New Booking. \n" +
                "6.Show Information of Employee. \n" +
                "7.Exit.");
        Scanner scanner = new Scanner(System.in);
        int yourChoose = scanner.nextInt();
        switch (yourChoose){
            case 1:
                addNewServies();
                menu();
                break;
            case 2:

                menu();
                break;
            case 3:

                menu();
                break;
            case 4:

                menu();
                break;
            case 6:

                menu();
                break;
            case 7:
                System.out.println("Goodbye.");
                break;
        }
    }

    static void addNewServies(){
        System.out.println("1.Add New Villa. \n" +
                "2.Add New House. \n" +
                "3.Add New Room. \n" +
                "4.Back to menu.");
        Scanner scanner = new Scanner(System.in);
        int yourChoose = scanner.nextInt();
        switch (yourChoose){
            case 1:

                addNewServies();
                break;
            case 2:

                addNewServies();
                break;

            case 3:

                addNewServies();
                break;
            case 4:
                menu();
                break;
            case 5:
                System.out.println("Your choose not exist.Please choose again.");
                addNewServies();
                break;
        }
    }
    static void
}
