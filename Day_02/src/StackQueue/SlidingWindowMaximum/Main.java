package StackQueue.SlidingWindowMaximum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SlidingWindow sw = new SlidingWindow();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter window size: ");
        int k = scanner.nextInt();

        int[] result = sw.SlidingWindowMaximum(arr, k);

        System.out.println("Sliding window maximums:");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
