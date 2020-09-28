package practice;

import java.util.Scanner;

public class test {
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.print("Enter your element you want search: ");
        int x = scanner.nextInt();
//        int x = 5;

        int result = search(arr, x);
        System.out.println("------------------------------");
        if(result == -1){
            System.out.println("Element is not present in array");
            System.out.println("------------------------------");
        }
        else{
            System.out.println("Element is present at index " + result);
            System.out.println("------------------------------");
        }
    }
}
