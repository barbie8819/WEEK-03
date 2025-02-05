package BinarySearchProblems.TargetInTwoDMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix (sorted as described):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the target value to search for:");
        int target = scanner.nextInt();

        boolean found = TwoDMatrixSearch.searchMatrix(matrix, target);
        if (found) {
            System.out.println("The target value is found in the matrix.");
        } else {
            System.out.println("The target value is not found in the matrix.");
        }

        scanner.close();
    }
}
