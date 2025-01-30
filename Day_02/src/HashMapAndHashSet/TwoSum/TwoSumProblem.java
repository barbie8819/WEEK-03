package HashMapAndHashSet.TwoSum;
import java.util.*;
public class TwoSumProblem {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
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

        int[] result = findTwoSum(arr, target);
        if (result.length > 0) {
            System.out.println("Indices: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found with given sum.");
        }
    }
}
