package controllers;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FindEmployee {
    public static Scanner scanner = new Scanner(System.in);
    private static final String EMPLOYEE = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Employee.csv";
    static Stack<Employee> customerStack = new Stack<>();
    public static void cabinet(){
        MainControllers.employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(EMPLOYEE);
        for (String x: stringList){
            String[] split = x.split(",");
            if (split.length != 1){
                Employee employee = new Employee(split[0],split[1],split[2],split[3]);
                MainControllers.employeeList.add(employee);
            }
        }
        for (int i = 0; i < MainControllers.employeeList.size(); i++){
            customerStack.push(MainControllers.employeeList.get(i));
        }
        for (Employee list: customerStack){
            System.out.println(list.toString());
        }
    }
    public static void findNameEmployee(){
        cabinet();
        System.out.println("Enter a employee want search: ");
        String findName = scanner.nextLine();
        boolean flag = false;

        while (!customerStack.isEmpty()) {
            if (customerStack.peek().getNameEmployee().equals(findName)) {
                System.out.println(customerStack.pop());
                flag = true;
                continue;
            }
            customerStack.pop();
        }
        if (!flag){
            System.err.println("Khong tim thay nhan vien trong danh sach");
        }
    }
}
