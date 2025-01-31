package SortingAlgorithms.InsertionSort;

import java.util.Scanner;

public class SortEmployee {
    public static void InsertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1, key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Emplyoees");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter IDs of Employees");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before sorting ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting ");
        InsertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    }


