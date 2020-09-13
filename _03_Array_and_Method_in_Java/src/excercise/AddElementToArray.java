package excercise;

import java.util.Scanner;

public class AddElementToArray {
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }

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
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter a element add to array: ");
        int x = scanner.nextInt();

        System.out.print("Location to insert into the array: ");
        int location = scanner.nextInt();

        int length = size;
        int newArray[];
        int j = 0;
        newArray = new int[length+1];
        for (i = 0; i < length+1; i++) {
            if ( i == location - 1 ) {
                newArray[j] = x;
                j = i + 1;

//                i = i - 1;
//                newArray[j] = array[location];
            }
            else {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.print("Now array is: ");
        for (i =0;i < newArray.length;i++) {
            System.out.print(newArray[i]+" ");
        }

        System.out.println(" ");
        sortASC(newArray);
        System.out.print("New array is: ");
        for (i =0;i < newArray.length;i++) {
            System.out.print(newArray[i]+" ");
        }

    }
}
