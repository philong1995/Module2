package exercise;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseInterger {
    public static void main(String[] args) {
        System.out.println("Before reverse: ");
        Stack<Integer> list1 = new Stack<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        Stack<Integer> list2 = new Stack<Integer>();

        for(int i = 0;i < list1.size();i++){
            System.out.println(list1.get(i));
        }

        int number = list1.size();
        for(int i = 0;i < number;i++){
            list2.push(list1.pop());
        }

        System.out.println("After reverse: ");

        for(int i = 0;i < list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}
