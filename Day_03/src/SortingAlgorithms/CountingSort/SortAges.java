package SortingAlgorithms.CountingSort;
import java.util.Arrays;
import java.util.Scanner;

public class SortAges {
    public static void countingSort(int[] ages) {
        int maxAge = 18;
        int minAge = 10;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] studentAges = new int[n];

        System.out.println("Enter the student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("Original Ages: " + Arrays.toString(studentAges));

        countingSort(studentAges);

        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));

        scanner.close();
    }
}
