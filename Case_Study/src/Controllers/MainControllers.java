package Controllers;

import models.House;
import models.Room;
import models.Service;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllers {

    public static Scanner scanner = new Scanner(System.in);
    private static String id;
    private static String nameService;
    private static String useArea;
    private static String payService;
    private static String amountPeople;
    private static String typeService;
    private static String standardRoom;
    private static String descriptionOfOtherAmenities;
    private static String swimmingPoolArea;
    private static String numberOfFloors;
    private static String freeService;
    private static final String VILLA = "/Users/macbookpro/Desktop/Module2/Case_Study/src/Controllers/Villa.csv";
    private static final String HOUSE = "/Users/macbookpro/Desktop/Module2/Case_Study/src/Controllers/House.csv";
    private static final String ROOM = "/Users/macbookpro/Desktop/Module2/Case_Study/src/Controllers/Room.csv";
    static List<Villa> villaList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Service> serviceList = new ArrayList<>();

    public static void menu() {
        System.out.println("----------------------------");
        System.out.println("1.Add New Services. \n" +
                "2.Show Services. \n" +
                "3.Add New Customer. \n" +
                "4.Show Information of Customer. \n" +
                "5.Add New Booking. \n" +
                "6.Show Information of Employee. \n" +
                "7.Exit.");
        System.out.println("----------------------------");
        System.out.print("Enter your choose: ");
        String yourChoose = scanner.nextLine();
        switch (Integer.parseInt(yourChoose)){
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
        System.out.println("----------------------------");
        System.out.print("Enter your choose: ");
        String yourChoose = scanner.nextLine();
        switch (Integer.parseInt(yourChoose)){
            case 1:
                addNewVilla();
                addNewServies();
                break;
            case 2:
                addNewHouse();
                addNewServies();
                break;
            case 3:
                addNewRoom();
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

//  Thêm vào Villa
    static void addNewVilla(){
        addService();
        System.out.print("Enter standard Villa: ");
        standardRoom = scanner.nextLine();
        System.out.print("Description of the facility: ");
        descriptionOfOtherAmenities = scanner.nextLine();
        System.out.print("Arena pool(bigger 30m2): ");
        swimmingPoolArea = scanner.nextLine();
        System.out.print("Number floor Villa: ");
        numberOfFloors = scanner.nextLine();

        Villa villa = new Villa(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, standardRoom, descriptionOfOtherAmenities, Float.parseFloat(swimmingPoolArea), Integer.parseInt(numberOfFloors));
        villaList.add(villa);
        serviceList.add(villa);
    }

    static void addNewHouse(){
        addService();
        System.out.print("Enter standard House: ");
        standardRoom = scanner.nextLine();
        System.out.print("Description of the facility: ");
        descriptionOfOtherAmenities = scanner.nextLine();
        System.out.print("Number floor House: ");
        numberOfFloors = scanner.nextLine();

        House house = new House(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, standardRoom, descriptionOfOtherAmenities, Integer.parseInt(numberOfFloors));
        houseList.add(house);
        serviceList.add(house);
    }

    static void addNewRoom(){
        addService();
        System.out.print("Enter free service(eat, drink): ");
        freeService = scanner.nextLine();

        Room room = new Room(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, freeService);
        roomList.add(room);
        serviceList.add(room);
    }

// Thêm vào dịch vụ
    static void addService(){
        System.out.print("Enter ID service: ");
        id = scanner.nextLine();
        System.out.print("Enter name service: ");
        nameService = scanner.nextLine();
        System.out.print("Enter a arena: ");
        useArea = scanner.nextLine();
        System.out.print("Enter a pay service: ");
        payService = scanner.nextLine();
        System.out.print("Enter people( max 20 people): ");
        amountPeople = scanner.nextLine();
        System.out.print("Enter type service (and Rent : Day, Month, Year, Hour): ");
        typeService = scanner.nextLine();
    }

    public static void main(String[] args) {
        menu();
    }
}
