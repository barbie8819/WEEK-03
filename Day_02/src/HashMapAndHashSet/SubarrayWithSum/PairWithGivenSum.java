package HashMapAndHashSet.SubarrayWithSum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairWithGivenSum {
        public static int[] findPairWithSum(int[] arr, int target) {
            Set<Integer> seen = new HashSet<>();

            for (int num : arr) {
                int complement = target - num;
                if (seen.contains(complement)) {
                    return new int[]{complement, num};
                }
                seen.add(num);
            }
            return null;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of elements in array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter target sum: ");
            int target = scanner.nextInt();

            int[] result = findPairWithSum(arr, target);
            if (result != null) {
                System.out.println("Pair with given sum: (" + result[0] + ", " + result[1] + ")");
            } else {
                System.out.println("No pair with given sum found.");
            }
        }
    }


