package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProduct extends ProductManager {

    static ArrayList <ProductManager> listProduct = new ArrayList<>();

    static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price product: ");
        double price = scanner.nextDouble();
        ProductManager addProduct = new ProductManager(id, name, price);
        listProduct.add(addProduct);
    }

    static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for ( int i = 0; i < listProduct.size(); i++){
            if (listProduct.get(i).getIdProduct() == id ) {
                System.out.print("Enter name edit: ");
                String name = scanner.nextLine();
                listProduct.get(i).setNameProduct(name);
            }
            else {
                System.out.println("not exist. Please enter id again.");
                edit();
                break;
            }
        }
    }

    static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        for ( int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct() == id) {
                listProduct.remove(i);
            }
            else {
                System.out.println("not exist. Please enter id again.");
                delete();
                break;
            }
        }
    }

    static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct() == id) {
                System.out.println(listProduct.get(i));
            }
            else {
                System.out.println("not exist. Please enter id again.");
                search();
                break;
            }
        }
    }

    static void exit(){
        System.out.println("Goodbye.");
    }

    public static void menu() {
        System.out.println("Menu : \n"+
                "--------------------\n"+
                "1.Add new Product.\n" +
                "2.Edit product.\n" +
                "3.Delete product.\n" +
                "4.Search product.\n" +
                "5.Exit.\n" +
                "--------------------");
        System.out.print("Enter your choose: ");
        Scanner choose = new Scanner(System.in);
        int yourChoose = choose.nextInt();
        switch (yourChoose) {
            case 1 :
                add();
                menu();
                break;
            case 2 :
                edit();
                menu();
                break;
            case 3 :
                delete();
                menu();
                break;
            case 4 :
                search();
                menu();
                break;
            case 5 :
                exit();
                break;
            default:
                System.out.println("Your choose failed. Please choose again.");
                menu();
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
