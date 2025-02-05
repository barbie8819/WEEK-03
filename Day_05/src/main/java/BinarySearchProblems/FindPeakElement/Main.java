package BinarySearchProblems.FindPeakElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int peakElementIndex = PeakElement.findPeakElement(arr);
        System.out.println("A peak element is at index: " + peakElementIndex);
        System.out.println("The peak element is: " + arr[peakElementIndex]);

        scanner.close();
    }
}
