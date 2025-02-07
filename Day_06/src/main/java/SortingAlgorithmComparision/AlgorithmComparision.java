package SortingAlgorithmComparision;

import java.util.Arrays;

public class AlgorithmComparision {
    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void Merge(int[] arr, int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;

            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }


    }

    public static void MergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);
            Merge(array, left, right, mid);
        }

    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition( array, low, high);
            quickSort( array, low, pivotIndex - 1);
            quickSort( array, pivotIndex + 1, high);
        }
    }

    // Partition function
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    // Swap function
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void CompareTime(int N){
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]= i;
        }

        long startTime = System.nanoTime();
        BubbleSort(array);
        long BubbleSortTime = System.nanoTime()-startTime;

        startTime =System.nanoTime();
        MergeSort(array,0,N-1);
        long MergeSortTime = System.nanoTime()-startTime;
        startTime =System.nanoTime();
        quickSort(array,0,N-1);
        long QuickSortTime = System.nanoTime()-startTime;

        System.out.println("The time taken by BubbleSort : "+ (double)BubbleSortTime/1000000.0 + "ms");
        System.out.println("The time taken by MergeSort : "+ (double)MergeSortTime/1000000.0 + "ms");
        System.out.println("The time taken by QuickSort : "+ (double)QuickSortTime/1000000.0 + "ms");

    }
}

