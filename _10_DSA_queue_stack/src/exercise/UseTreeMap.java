package exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UseTreeMap<N> {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        // khởi tạo arr
//        int [] arr = new int [n];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            arr[i] = scanner.nextInt();
//        }
        int[] arr = {1,2,3,4,3,2,1};
        // tìm số lần xuất hiện của các phần tử
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            addElement(map, arr[i]);
        }
        System.out.print("Các phần tử xuất hiện : \n");
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }
    }

    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}
