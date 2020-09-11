package excercise;

import java.util.Scanner;

public class add_element_to_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        } while (size > 10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter a element add to array: ");
        int x = scanner.nextInt();

        System.out.println("Location to insert into the array: ");
        int location = scanner.nextInt();
        array[0] = x;

        System.out.print("array is: "+array);


    }
}
