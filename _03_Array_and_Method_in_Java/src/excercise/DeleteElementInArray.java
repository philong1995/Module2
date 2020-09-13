package excercise;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a array size : ");
            n = scanner.nextInt();
        } while (n <= 0);

        int array[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + " in array: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter a number you want delete: ");
        int k = scanner.nextInt();

//        int h = 0;
//        for (; array[h] == array[array.length-1]; h++) {
//            boolean t = false;
//            for (i = 0; i < n; i++) {
//                if (array[i] == k) {
//                    t = true;
//                    break;
//                }
//            }
//            if (t) {
//                System.out.println("Number you want delete is a element " + (i + 1) + " in array.");
//            } else {
//                System.out.println("Number you want delete not in array.");
//            }
//        }

        for (c = i = 0; i < n; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }

        n = c;

        System.out.println("new array after delete " + k + " is: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
