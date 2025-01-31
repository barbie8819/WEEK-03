package SortingAlgorithms.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class ExamScoreSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            swap(scores, i, minIndex);
        }
    }

    // Swap function
    private static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] examScores = new int[n];

        System.out.println("Enter the exam scores:");
        for (int i = 0; i < n; i++) {
            examScores[i] = scanner.nextInt();
        }

        System.out.println("Original Scores: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("Sorted Scores: " + Arrays.toString(examScores));

        scanner.close();
    }
}
