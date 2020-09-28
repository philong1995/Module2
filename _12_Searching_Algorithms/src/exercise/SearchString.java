package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        List<Character> list = new ArrayList<>();
        list.add(string.charAt(0));
        int j = 0;
        for (int i = 1; i < string.length();i++){
            if (string.charAt(i) > list.get(j)){
                list.add(string.charAt(i));
                j++;
            }
        }

        System.out.println("-------------------------");
        System.out.print("Ascending string : ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
    }
}
