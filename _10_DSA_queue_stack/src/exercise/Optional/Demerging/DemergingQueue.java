package exercise.Optional.Demerging;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DemergingQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row in array: ");
        int row = scanner.nextInt();
        System.out.print("Colum in array: ");
        int colum = scanner.nextInt();

        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

    }




    Queue<String> NAM = new LinkedList<String>();
    Queue<String> NU = new LinkedList<String>();


}
