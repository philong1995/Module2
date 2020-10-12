package controllers;

import models.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainControllers {

    public static Scanner scanner = new Scanner(System.in);
    private String id;
    private String nameService;
    private String useArea;
    private String payService;
    private String amountPeople;
    private String typeService;

    private static final String CUSTOMER = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Customer.csv";
    private static final String VILLA = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Villa.csv";
    private static final String HOUSE = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/House.csv";
    private static final String ROOM = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Room.csv";
    private static final String BOOKING ="/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Booking.csv";
//    private static final String EMPLOYEE = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Employee.csv";
    private static final String COMMA = ", ";

    static List<Villa> villaList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Service> serviceList = new ArrayList<>();
    static List<Customer> customerList = new ArrayList<>();
//    static List<Employee> employeeList = new ArrayList<>();

    public void menu() {
        String yourChoose;
        do {
        System.out.println("----------------------------");
        System.out.println("1.Add New Services. \n" +
                "2.Show Services. \n" +
                "3.Add New Customer. \n" +
                "4.Show Information of Customer. \n" +
                "5.Add New Booking. \n" +
                "6.Show Information of Employee. \n" +
                "7.Booking Cinema. \n" +
                "8.Find Employee. \n" +
                "9.Exit.");
        System.out.println("----------------------------");
        System.out.print("Enter your choose: ");
        yourChoose = scanner.nextLine();
            switch (Integer.parseInt(yourChoose)){
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInfoCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showEmployee();
                    break;
                case 7:
                    BookingCinema.addTicket();
                    break;
                case 8:
                    FindEmployee.findProfileByName();
                    break;
                case 9:
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                default:
                    System.out.println("Your choose not exist.Please choose again.");
                    break;
            }
        }while (Integer.parseInt(yourChoose) < 10 || Integer.parseInt(yourChoose) > 0);
    }

//      Thêm vào dịch vụ mới.
    void addNewServies() {
        String yourChoose;
        do {
            System.out.println("1.Add New Villa. \n" +
                    "2.Add New House. \n" +
                    "3.Add New Room. \n" +
                    "4.Back to menu.");
            System.out.println("----------------------------");
            System.out.print("Enter your choose: ");
            yourChoose = scanner.nextLine();
            switch (Integer.parseInt(yourChoose)) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Your choose not exist.Please choose again.");
                    break;
            }
        }while (Integer.parseInt(yourChoose) < 5 || Integer.parseInt(yourChoose) > 0);
    }

//  Thêm vào Villa
    void addNewVilla(){
        addService();
        System.out.print("Enter standard Villa: ");
        String standardRoom = scanner.nextLine();
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
        String descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Arena pool(bigger 30m2): ");
        String swimmingPoolArea = scanner.nextLine();
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
        String numberOfFloors = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumberFloor(numberOfFloors)){
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
    void addNewHouse(){
        addService();
        System.out.print("Enter standard House: ");
        String standardRoom = scanner.nextLine();
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
        String descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Number floor House: ");
        String numberOfFloors = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkNumberFloor(numberOfFloors)){
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
    void addNewRoom(){
        addService();
        System.out.print("Enter free service(eat, drink): ");
        String freeService = scanner.nextLine();

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
    void addService(){
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
                System.err.print("Enter again for correct format (Xxxx Xxxx): ");
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

    void showService() {
        String yourchoose;
        do {
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
            yourchoose = scanner.nextLine();
            switch (Integer.parseInt(yourchoose)) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showVillaNotDuplicate();
                    break;
                case 5:
                    showHouseNotDuplicate();
                    break;
                case 6:
                    showRoomNotDuplicate();
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                default:
                    System.out.println("Your choose not exist.Please choose again.");
                    break;
            }
        }while (Integer.parseInt(yourchoose) < 9 || Integer.parseInt(yourchoose) > 0);
    }

    void addNewCustomer(){
        System.out.print("Enter your name: ");
        String nameCustomer = scanner.nextLine();
        boolean check = false;
        while (!check){
            check = true;
            if (!checkNameService(nameCustomer)){
                System.err.print("Enter again for correct format (Xxxx Xxxx): ");
                nameCustomer = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter your birth day: ");
        String birthDay = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkBirth(birthDay)){
                System.err.print("Enter again for correct format ( dd/mm/yyyy ): ");
                birthDay = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter your gender: ");
        String gender = upperCaseWords(scanner.nextLine());
        check = false;
        while (!check){
            check = true;
            if (!checkGender(gender)){
                System.err.print("Enter again gender (Female or Male or Unknow) : ");
                gender = upperCaseWords(scanner.nextLine());
                check = false;
            }
        }

        System.out.print("Enter your idCard: ");
        String idCard = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkID(idCard)){
                System.err.print("Enter again for correct format ( XXX XXX XXX ): ");
                idCard = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        check = false;
        while (!check){
            check = true;
            if (!checkEmail(email)){
                System.err.print("Enter again for correct format ( abc@abc.abc ): ");
                email = scanner.nextLine();
                check = false;
            }
        }

        System.out.print("Enter your type customer: ");
        String typeCustomer = upperCaseWords(scanner.nextLine());
        check = false;
        while (!check){
            check = true;
            if (!checkTypeCustomer(typeCustomer)){
                System.err.print("Enter again ( Diamond, Platinum, Gold, Silver, Member): ");
                typeCustomer = upperCaseWords(scanner.nextLine());
                check = false;
            }
        }

        System.out.print("Enter your address: ");
        String address = upperCaseWords(scanner.nextLine());

        Service service = null;
//        System.out.print("Enter your service: ");
//        service = upperCaseWords(scanner.nextLine());

        Customer customer = new Customer(nameCustomer, birthDay, gender, idCard, phoneNumber, email, typeCustomer, address, service);
        customerList.add(customer);

        String line = null;
        for (Customer customers : customerList){
            line = customers.getFullName() + COMMA + customers.getBirthDay() + COMMA + customers.getGender() + COMMA + customers.getIdCard() + COMMA + customers.getPhoneNumber() + COMMA + customers.getEmail() + COMMA + customers.getTypeCustomer() + COMMA + customers.getAddress() + COMMA + customer.getServices();
            ReadAndWrite.writeFile(CUSTOMER,line);
        }
    }

    void showInfoCustomer(){
        List<String> lineList = ReadAndWrite.readFile(CUSTOMER);
        for(String element : lineList){
            System.out.println(element);
        }
    }

    void showEmployee(){
        System.out.println(InfoEmployee.employeeMap);
    }

//    Hiển thị villa
    void showAllVilla(){
        List<String> lineList = ReadAndWrite.readFile(VILLA);
        System.out.println(lineList);
    }

    void showVillaNotDuplicate() {
        System.out.println(ReadAndWrite.readFile(VILLA));
        if (villaList.isEmpty()) {
            System.out.println("Villa File Empty!!!");
        }
        int index = 1;
        Set<Villa> villasSet = new TreeSet<>(villaList);
        for (Villa villa : villasSet) {
            System.out.println(index++ + " " + villa.showInfo());
        }
    }

//    Hiển thị house
    void showAllHouse(){
        List<String> lineList = ReadAndWrite.readFile(HOUSE);
        System.out.println(lineList);
    }

    void showHouseNotDuplicate() {
        System.out.println(ReadAndWrite.readFile(HOUSE));
        if (houseList.isEmpty()) {
            System.out.println("House File Empty!!!");
        }
        int index = 1;
        Set<House> housesSet = new TreeSet<>(houseList);
        for (House house : housesSet) {
            System.out.println(index++ + " " + house.showInfo());
        }
    }

//    Hiển thị house
    void showAllRoom(){
        List<String> lineList = ReadAndWrite.readFile(ROOM);
        System.out.println(lineList);
    }

    void showRoomNotDuplicate() {
        System.out.println(ReadAndWrite.readFile(ROOM));
        if (roomList.isEmpty()) {
            System.out.println("Room File Empty!!!");
        }
        int index = 1;
        Set<Room> roomsSet = new TreeSet<>(roomList);
        for (Room room : roomsSet) {
            System.out.println(index++ + " " + room.showInfo());
        }
    }

//    void addFileBooking(int iPositionCustomer) {
//        String line = null;
//        line = customerList.get(iPositionCustomer - 1).getFullName() + COMMA +
//                customerList.get(iPositionCustomer - 1).getBirthDay() + COMMA +
//                customerList.get(iPositionCustomer - 1).getGender() + COMMA +
//                customerList.get(iPositionCustomer - 1).getIdCard() + COMMA +
//                customerList.get(iPositionCustomer - 1).getPhoneNumber() + COMMA +
//                customerList.get(iPositionCustomer - 1).getEmail() + COMMA +
//                customerList.get(iPositionCustomer - 1).getTypeCustomer() + COMMA +
//                customerList.get(iPositionCustomer - 1).getAddress() + COMMA +
//                customerList.get(iPositionCustomer - 1).getServices().showInfo();
//        ReadAndWrite.writeFile(BOOKING, line);
//        menu();
//    }

    void addFileBooking(int chooseCustomer){
        String line = customerList.get(chooseCustomer - 1).getFullName() + COMMA + customerList.get(chooseCustomer - 1).getBirthDay() +
                COMMA + customerList.get(chooseCustomer - 1).getGender() + COMMA + customerList.get(chooseCustomer - 1).getIdCard() +
                COMMA + customerList.get(chooseCustomer - 1).getPhoneNumber() + COMMA + customerList.get(chooseCustomer - 1).getEmail() +
                COMMA + customerList.get(chooseCustomer - 1).getTypeCustomer() + COMMA + customerList.get(chooseCustomer - 1).getAddress() +
                COMMA + customerList.get(chooseCustomer - 1).getServices().showInfo();
        ReadAndWrite.writeFile(BOOKING,line);
    }

    void addNewBooking(){
        showInfoCustomer();
        System.out.print("Choose customer want booking: ");
        String chooseCustomer = scanner.nextLine();
        System.out.println("1. Booking Villa. \n" +
                "2. Booking House. \n" +
                "3. Booking Room. \n" +
                "4. Back to menu.");
        System.out.print("Choose service want booking: ");
        int chooseService = scanner.nextInt();
        scanner.nextLine();
        switch (chooseService){
            case 1:
                showAllVilla();
                System.out.print("Enter a Villa want booking: ");
                String chooseVilla = scanner.nextLine();
                customerList.get(Integer.parseInt(chooseCustomer) - 1).setServices(villaList.get(Integer.parseInt(chooseVilla) - 1));
                addFileBooking(Integer.parseInt(chooseCustomer));
                System.out.println("Booking Done!!!");
                menu();
                break;
            case 2:
                showAllRoom();
                menu();
                break;
            case 3:
                showAllRoom();
                System.out.println("Enter a Villa want booking: ");
                String chooseRoom = scanner.nextLine();
                customerList.get(Integer.parseInt(chooseCustomer) - 1).setServices(roomList.get(Integer.parseInt(chooseRoom) - 1));
                addFileBooking(Integer.parseInt(chooseCustomer));
                System.out.println("Booking Done!!!");
                menu();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Enter choose again!!!");
                addNewBooking();
        }
    }

//    void addNewBooking() {
//        showInfoCustomer();
//        System.out.print("Enter customer want booking: ");
//        String iPositionCustomer = scanner.nextLine();
//        String choose;
//        do {
//            System.out.println("-------------------------------------");
//            System.out.println(
//                            "1.\tBooking Villa\n" +
//                            "2.\tBooking House\n" +
//                            "3.\tBooking Room\n" +
//                            "4.\tBack Menu\n" +
//                            "5.\tExit");
//            System.out.print("Enter your choose: ");
//            choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    showAllVilla();
//                    System.out.print("Choose Villa you want: ");
//                String chooseVilla = scanner.nextLine();
//                customerList.get(Integer.parseInt(iPositionCustomer) - 1).setServices(villaList.get(Integer.parseInt(chooseVilla) - 1));
//                addFileBooking(Integer.parseInt(iPositionCustomer));
//                System.out.println("Done!!!");
//                    break;
//                case "2":
////                    showAllHouse();
////                    System.out.print("Choose House want rent: ");
////                    addFileBooking(iPositionCustomer);
//                    break;
//                case "3":
////                    showAllRoom();
////                    System.out.print("Choose Room want rent: ");
////                    addFileBooking(iPositionCustomer);
//                    break;
//                case "4":
//                    menu();
//                    break;
//                case "5":
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.print("Your choose not exist.Please choose again!!!");
//            }
//        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= 5);
//    }


    boolean checkIDService(String id){
        Pattern pattern = Pattern.compile("(SV)(VL|HO|RO)(-)[0-9]{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    boolean checkNameService(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]+(\\s[A-Z][a-z]+)*");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    boolean checkNumber(String number){
        Pattern pattern = Pattern.compile("[0-9]+[.,]?[0-9]+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    boolean checkNumberFloor(String numberFloor){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(numberFloor);
        return matcher.matches();
    }

    boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("[A-za-z0-9]*([.]?\\w*)*(@)[a-z]*(.)[a-z]*");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    boolean checkGender(String gender){
        Pattern pattern = Pattern.compile("(Female)|(Male)|(Unknow)");
        Matcher matcher = pattern.matcher(gender);
        return matcher.matches();
    }

    boolean checkID(String id){
        Pattern pattern = Pattern.compile("[0-9]{3}( )[0-9]{3}( )[0-9]{3}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    boolean checkBirth(String birth){
        Pattern pattern = Pattern.compile("([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})");
        Matcher matcher = pattern.matcher(birth);
        return matcher.matches();
    }

    boolean checkTypeCustomer(String type){
        Pattern pattern = Pattern.compile("(Diamond)|(Platinum)|(Gold)|(Silver)|(Member)");
        Matcher matcher = pattern.matcher(type);
        return matcher.matches();
    }

    public String upperCaseWords(String line) {
        line = line.trim().toLowerCase();
        String[] data = line.split("\\s");
        line = "";
        for(int i =0;i< data.length;i++)
        {
            if(data[i].length()>1)
                line = line + data[i].substring(0,1).toUpperCase()+data[i].substring(1)+" ";
            else
                line = line + data[i].toUpperCase();
        }
        return line.trim();
    }



    public static void main(String[] args) {
        MainControllers mainControllers = new MainControllers();
        mainControllers.menu();
    }
}