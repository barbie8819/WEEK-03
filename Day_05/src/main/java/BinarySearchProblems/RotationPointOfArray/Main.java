package BinarySearchProblems.RotationPointOfArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The number of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int rotationPoint = RotationPoint.RotationPointFinder(arr);
        System.out.println("The roation point of array is : " +rotationPoint);
    }
}
