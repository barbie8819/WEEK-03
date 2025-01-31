package SortingAlgorithms.HeapSort;
import java.util.Arrays;
import java.util.Scanner;
public class SalaryOfApplicants {
    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(salaries, 0, i);
            heapify(salaries, i, 0);
        }
    }

    // Heapify function
    private static void heapify(double[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(salaries, i, largest);
            heapify(salaries, n, largest);
        }
    }

    // Swap function
    private static void swap(double[] salaries, int i, int j) {
        double temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of job applicants: ");
        int n = scanner.nextInt();
        double[] salaryDemands = new double[n];

        System.out.println("Enter the expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaryDemands[i] = scanner.nextDouble();
        }

        System.out.println("Original Salaries: " + Arrays.toString(salaryDemands));

        heapSort(salaryDemands);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaryDemands));

        scanner.close();
    }
}
