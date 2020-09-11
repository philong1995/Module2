package excercise;

        import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size of array 1: ");
            size1 = scanner.nextInt();
        }while (size1 <= 0);
        int array1[] = new int[size1];
        int i = 0;
        for (i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i+1) + " in array 1: ");
            array1[i] = scanner.nextInt();
        }

        do {
            System.out.print("Enter a size of array 2: ");
            size2 = scanner.nextInt();
        }while (size2 <= 0);
        int array2[] = new int[size2];
//        int j = 0;
        for (i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i+1) + " in array 2: ");
            array2[i] = scanner.nextInt();
        }

        int bigSize = size1 + size2;
        int array3[] = new int[bigSize];
//        int k = 0;
        for (i = 0;i < size1; i++) {
            array3[i] = array1[i];
            System.out.println("Element " + ( i + 1) +" of array = array1 + array2 is: "+array3[i]);
        }
//        int h = 0;
        int m = array1.length;
        for (i = 0; i < size2; i++) {
            array3[m] = array2[i];
            System.out.println("Element " + ( m + 1) +" of array = array1 + array2 is: "+array3[m]);
            m++;
        }
        System.out.print("array1 : ");
        for (i = 0;i < array1.length;i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println(" ");
        System.out.print("array2 : ");
        for (i = 0;i < array2.length;i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println(" ");
        System.out.print("array = array1 + array2 : ");
        for (i = 0;i < array3.length;i++) {
            System.out.print(array3[i]+" ");
        }
    }
}
