package SortingAlgorithms.BubbleSort;

import java.util.Scanner;

public class SortStudent {
    public static void BubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter marks of students");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before sorting ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting ");
        BubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
