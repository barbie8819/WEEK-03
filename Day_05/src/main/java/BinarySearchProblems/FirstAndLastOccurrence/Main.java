package BinarySearchProblems.FirstAndLastOccurrence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sorted array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value to find its first and last occurrence:");
        int target = scanner.nextInt();

        int firstOccurrence = FirstAndLastOccurred.findFirstOccurrence(arr, target);
        int lastOccurrence = FirstAndLastOccurred.findLastOccurrence(arr, target);

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of the target is at index: " + firstOccurrence);
            System.out.println("Last occurrence of the target is at index: " + lastOccurrence);
        } else {
            System.out.println("The target value is not found in the array.");
        }

        scanner.close();
    }
}
