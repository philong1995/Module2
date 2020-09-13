package excercise;

import java.util.Scanner;

public class SearchValueMaxInMatrix {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row in matrix: ");
        m = scanner.nextInt();
        System.out.print("Enter column in matrix: ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];

        System.out.println("Enter value in matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Value max in matrix = " + max);
    }
}

