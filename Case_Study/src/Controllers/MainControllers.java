package Controllers;

import models.House;
import models.Room;
import models.Service;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static final String COMMA = ", ";
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
                showService();
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
                System.out.println("Goodbye!!!");
                System.exit(0);
            default:
                System.out.println("Your choose not exist.Please choose again.");
                menu();
                break;
        }
    }

//      Thêm vào dịch vụ mới.
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
            default:
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
        boolean check = false;
        while (!check){
            check = true;
            if (!checkNameService(standardRoom)){
                System.err.print("Enter again for correct format ( Xxxxx Xxxxx ): ");
                standardRoom = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Description of the facility: ");
        descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Arena pool(bigger 30m2): ");
        swimmingPoolArea = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumber(swimmingPoolArea)){
                System.err.print("Enter again a number > 30m2: ");
                swimmingPoolArea = scanner.nextLine();
                check = false;
            }
            while (Float.parseFloat(swimmingPoolArea) < 30){
                System.err.print("Enter again a number > 30m2: ");
                swimmingPoolArea = scanner.nextLine();
            }
        }

        System.out.print("Number floor Villa: ");
        numberOfFloors = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumber(numberOfFloors)){
                System.err.print("Enter again integer: ");
                numberOfFloors = scanner.nextLine();
                check = false;
            }
        }

        Villa villa = new Villa(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, standardRoom, descriptionOfOtherAmenities, Float.parseFloat(swimmingPoolArea), Integer.parseInt(numberOfFloors));
        villaList.add(villa);
        serviceList.add(villa);

        String line = null;

        for (Villa villas : villaList){
            line = villas.getIdService() + COMMA + villas.getNameService() + COMMA + villas.getAreaService() + COMMA + villas.getPayService() + COMMA + villas.getAmountPeople() + COMMA + villas.getTypeService() + COMMA + villas.getStandardVilla() + COMMA + villas.getOtherFacilities() + COMMA + villas.getAreaPool() + COMMA + villas.getAmountFloor();
            ReadAndWrite.writeFile(VILLA,line);
        }
    }

// Thêm vào House
    static void addNewHouse(){
        addService();
        System.out.print("Enter standard House: ");
        standardRoom = scanner.nextLine();
        boolean check = false;
        while (!check){
            check = true;
            if (!checkNameService(standardRoom)){
                System.err.print("Enter again for correct format ( Xxxxx Xxxxx ): ");
                standardRoom = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Description of the facility: ");
        descriptionOfOtherAmenities = scanner.nextLine();
        System.out.print("Number floor House: ");
        numberOfFloors = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumber(numberOfFloors)){
                System.err.print("Enter again integer: ");
                numberOfFloors = scanner.nextLine();
                check = false;
            }
        }

        House house = new House(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, standardRoom, descriptionOfOtherAmenities, Integer.parseInt(numberOfFloors));
        houseList.add(house);
        serviceList.add(house);

        String line = null;

        for (House houses : houseList){
            line = houses.getIdService() + COMMA + houses.getNameService() + COMMA + houses.getAreaService() + COMMA + houses.getPayService() + COMMA + houses.getAmountPeople() + COMMA + houses.getTypeService() + COMMA + houses.getStandardHouse() + COMMA + houses.getConvenient() + COMMA + houses.getFloorHouse();
            ReadAndWrite.writeFile(HOUSE,line);
        }
    }

// Thêm vào room
    static void addNewRoom(){
        addService();
        System.out.print("Enter free service(eat, drink): ");
        freeService = scanner.nextLine();

        Room room = new Room(id, nameService, Integer.parseInt(useArea), Integer.parseInt(payService), Integer.parseInt(amountPeople), typeService, freeService);
        roomList.add(room);
        serviceList.add(room);

        String line = null;

        for (Room rooms : roomList){
            line = rooms.getIdService() + COMMA + rooms.getNameService() + COMMA + rooms.getAreaService() + COMMA + rooms.getPayService() + COMMA + rooms.getAmountPeople() + COMMA + rooms.getTypeService() + COMMA + rooms.getFreeService();
            ReadAndWrite.writeFile(ROOM,line);
        }
    }

// Thêm vào dịch vụ
    static void addService(){

        System.out.print("Enter ID service: ");
        id = scanner.nextLine();
        boolean check = false;
        while (!check){
            check = true;
            if (!checkIDService(id)){
                System.err.print("Enter again for correct format (SV(VL or HO or RO)-YYYY): ");
                id = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter name service: ");
        nameService = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNameService(nameService)){
                System.err.print("Enter again for correct format ( Aaaaa ): ");
                nameService = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter a arena: ");
        useArea = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumber(useArea)){
                System.err.print("Enter again a number: ");
                useArea = scanner.nextLine();
                check = false;
            }
            while (Float.parseFloat(useArea) < 30){
                System.err.print("Enter again > 30m2: ");
                useArea = scanner.nextLine();
            }

        }

        System.out.print("Enter a pay service($): ");
        payService = scanner.nextLine();
        check = false;
        while (!check) {
            check = true;
            if (!checkNumber(payService)) {
                System.err.print("Enter again a number: ");
                payService = scanner.nextLine();
                check = false;
            }
            while (Float.parseFloat(payService) < 0) {
                System.err.print("Enter again pay($) > 0: ");
                payService = scanner.nextLine();
            }
        }

        System.out.print("Enter people( max 20 people): ");
        amountPeople = scanner.nextLine();
        check = false;
        while (!check) {
            check = true;
            if (!checkNumber(amountPeople)) {
                System.err.print("Enter again a number: ");
                amountPeople = scanner.nextLine();
                check = false;
            }
            while (Float.parseFloat(amountPeople) > 20 && Float.parseFloat(amountPeople) <= 0) {
                System.err.print("Enter again amount people > 0 and < 20: ");
                amountPeople = scanner.nextLine();
            }
        }

        System.out.print("Enter type service : ");
        typeService = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNameService(typeService)){
                System.err.print("Enter again for correct format ( Xxxx Xxxx ): ");
                typeService = scanner.nextLine();
                check = false;
            }
        }
    }

    static void showService(){
        System.out.println("1.Show all Villa. \n" +
                "2.Show all House. \n" +
                "3.Show all Room. \n" +
                "4.Show All Name Villa Not Duplicate. \n" +
                "5.Show All Name House Not Duplicate. \n" +
                "6.Show All Name Room Not Duplicate. \n" +
                "7.Back to menu. \n" +
                "8.Exit.");
        System.out.println("----------------------------");
        System.out.print("Enter your choose: ");
        String yourchoose = scanner.nextLine();
        switch (Integer.parseInt(yourchoose)){
            case 1:
                showAllVilla();
                showService();
                break;
            case 2:
                showAllHouse();
                showService();
                break;
            case 3:
                showAllRoom();
                showService();
                break;
            case 7:
                menu();
                break;
            case 8:
                System.out.println("Goodbye!!!");
                System.exit(0);
            default:
                System.out.println("Your choose not exist.Please choose again.");
                showService();
                break;
        }
    }

//    Hiển thị villa
    static void showAllVilla(){
        List<String> lineList = ReadAndWrite.readFile(VILLA);
        System.out.println(lineList);
    }

//    Hiển thị house
    static void showAllHouse(){
        List<String> lineList = ReadAndWrite.readFile(HOUSE);
        System.out.println(lineList);
    }

//    Hiển thị house
    static void showAllRoom(){
        List<String> lineList = ReadAndWrite.readFile(ROOM);
        System.out.println(lineList);
    }

    static boolean checkIDService(String id){
        Pattern pattern = Pattern.compile("(SV)(VL|HO|RO)(-)[0-9]{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    static boolean checkNameService(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]+(\\s[A-Z][a-z]+)*");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    static boolean checkNumber(String number){
        Pattern pattern = Pattern.compile("[0-9]+[.,]?[0-9]+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    static boolean checkNumberFloor(String numberFloor){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(numberFloor);
        return matcher.matches();
    }

    public static void main(String[] args) {
        menu();
    }
}