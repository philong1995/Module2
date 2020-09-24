package exercise;

import java.util.TreeMap;

public class StringTreeMap {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Chuỗi ban đầu: ");
        String string = "Bui Phi Long dang hoc o CodeGym.";
        System.out.println(string);
        System.out.println();

        System.out.print("Chuyển đổi chuỗi trước khi đếm: ");
        String newString = string.toLowerCase();
        System.out.println(newString);
        System.out.println();

        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        for(int i = 0; i < newString.length();i++){
            map.put(newString.charAt(i),0);
        }

        for (Character key : map.keySet()) {
            for(int i = 0; i < newString.length();i++){
                if (key.equals(newString.charAt(i))) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }

        System.out.print("Các phần tử xuất hiện : \n");
        for (Character key : map.keySet()) {
            System.out.println("Kí tự " +key +" xuất hiện " +map.get(key)+" lần.");
        }
    }
}
