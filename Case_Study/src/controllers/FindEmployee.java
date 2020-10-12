package controllers;

import models.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class FindEmployee {
    public static Stack<Employee> employeeStack = new Stack<>();

    public static void findProfileByName() {
        boolean flag = false;
        if (employeeStack.isEmpty()) {
            System.err.println("Employee is Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name need find: ");
        String nameEmployee = scanner.nextLine();
        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getNameEmployee().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().toString());
                flag = true;
                continue;
            }
            employeeStack.pop();
        }
        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

}
