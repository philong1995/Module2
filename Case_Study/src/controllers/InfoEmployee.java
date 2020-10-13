package controllers;

import models.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoEmployee {
    private static final String EMPLOYEE = "/Users/macbookpro/Desktop/Module2/Case_Study/src/data/Employee.csv";
    private static final String COMMA = ", ";
    static Map<String,Employee> employeeMap = new HashMap<>();
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("001","Nguyen Van Mot","22","Da Nang");
        Employee employee2 = new Employee("002","Nguyen Thi Hai","21","Quang Nam");
        Employee employee3 = new Employee("003","Nguyen Van Ba","23","Nghe An");
        Employee employee4 = new Employee("004","Nguyen Thi Bon","24","Quang Ngai");
        Employee employee5 = new Employee("005","Nguyen Van Nam","22","Ha Tinh");
        Employee employee6 = new Employee("006","Nguyen Thi Sau","23","Quang Tri");
        Employee employee7 = new Employee("007","Nguyen Van Bay","22","Quang Binh");
        Employee employee8 = new Employee("008","Nguyen Thi Tam","25","Quang Nam");
        Employee employee9 = new Employee("009","Nguyen Van Chin","21","Da Nang");
        Employee employee10 = new Employee("010","Nguyen Thi Muoi","23","Hue");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);

        String line;
        for (Employee employee : employeeList){
            line = employee.getNameEmployee()+COMMA+employee.getAgeEmployee()+COMMA+employee.getAddressEmployee();
            ReadAndWrite.writeFile(EMPLOYEE,line);
        }

        employeeMap.put(employee1.getIdEmployee(),employee1);
        employeeMap.put(employee2.getIdEmployee(),employee2);
        employeeMap.put(employee3.getIdEmployee(),employee3);
        employeeMap.put(employee4.getIdEmployee(),employee4);
        employeeMap.put(employee5.getIdEmployee(),employee5);
        employeeMap.put(employee6.getIdEmployee(),employee6);
        employeeMap.put(employee7.getIdEmployee(),employee7);
        employeeMap.put(employee8.getIdEmployee(),employee8);
        employeeMap.put(employee9.getIdEmployee(),employee9);
        employeeMap.put(employee10.getIdEmployee(),employee10);

        for(Map.Entry<String, Employee> employee : employeeMap.entrySet()){
            System.out.println(employee.getKey() + " " + employee.getValue());
        }
    }
}
