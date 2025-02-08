package ArrayVsHashSetVsTreeSet;

import java.util.*;

public class Main {
    private static boolean linearSearch(Integer[] array, int key) {
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            int searchValue = random.nextInt(size);
            Integer[] array = new Integer[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                int value = random.nextInt(size * 10);
                array[i] = value;
                hashSet.add(value);
                treeSet.add(value);
            }

            long start = System.nanoTime();
            boolean foundInArray = linearSearch(array, searchValue);
            long end = System.nanoTime();
            System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            boolean foundInHashSet = hashSet.contains(searchValue);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            boolean foundInTreeSet = treeSet.contains(searchValue);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

            System.out.println("---------------------------");
        }

    }
}
