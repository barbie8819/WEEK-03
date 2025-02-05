package LinearSearchProblems.FirstNegativeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        int index = FirstNegativeInArray.NegativeNumberFinder(arr);
        if(index!=-1)
            System.out.println("The index of first negative number is :" + index);
        else{
            System.out.println("There is no negative numbers");

        }
    }
}
