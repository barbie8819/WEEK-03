package SortingAlgorithms.QuickSort;
import java.util.Arrays;
import java.util.Scanner;
public class SortProductPrices {
        public static void quickSort(double[] prices, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(prices, low, high);
                quickSort(prices, low, pivotIndex - 1);
                quickSort(prices, pivotIndex + 1, high);
            }
        }

        // Partition function
        private static int partition(double[] prices, int low, int high) {
            double pivot = prices[high]; // Choosing last element as pivot
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (prices[j] < pivot) {
                    i++;
                    swap(prices, i, j);
                }
            }
            swap(prices, i + 1, high);
            return i + 1;
        }

        // Swap function
        private static void swap(double[] prices, int i, int j) {
            double temp = prices[i];
            prices[i] = prices[j];
            prices[j] = temp;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of products: ");
            int n = scanner.nextInt();
            double[] productPrices = new double[n];

            System.out.println("Enter the product prices:");
            for (int i = 0; i < n; i++) {
                productPrices[i] = scanner.nextDouble();
            }

            System.out.println("Original Prices: " + Arrays.toString(productPrices));

            quickSort(productPrices, 0, productPrices.length - 1);

            System.out.println("Sorted Prices: " + Arrays.toString(productPrices));

            scanner.close();
        }

    }

