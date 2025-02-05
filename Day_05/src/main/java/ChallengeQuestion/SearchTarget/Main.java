package ChallengeQuestion.SearchTarget;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int firstMissingPositive = LinearAndBinarySearch.findFirstMissingPositive(Arrays.copyOf(nums, nums.length));
        System.out.println("The first missing positive integer is: " + firstMissingPositive);

        System.out.println("Enter the target value to find its index:");
        int target = scanner.nextInt();

        Arrays.sort(nums);
        int targetIndex = LinearAndBinarySearch.binarySearch(nums, target);

        if (targetIndex != -1) {
            System.out.println("The target value is found at index: " + targetIndex);
        } else {
            System.out.println("The target value is not found in the array.");
        }

        scanner.close();
    }
}
