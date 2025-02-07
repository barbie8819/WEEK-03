package LinearVsBinarySearch;

import java.util.Arrays;
import java.util.Random;

public class SearchComparisions {
    public static int LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static int BinarySearch(int[] arr, int target){
        int n = arr.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid]==target)
                return mid;
            else if(target > arr[mid]){
                left=mid+1;
            }
            else{
                right= mid -1;
            }
        }
        return -1;

    }
    public static void CompareTime(int N){
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]= i;
        }
        int target = array[N/2];
        long startTime = System.nanoTime();
        int index = LinearSearch(array,target);
        long linearTime = System.nanoTime()-startTime;
        Arrays.sort(array);
        startTime =System.nanoTime();
        int indexBinary = BinarySearch(array,target);
        long binaryTime = System.nanoTime()-startTime;
        System.out.println("The element "+ target + " is found at index  "+index + " By Linear Search");
        System.out.println("The element "+ target + " is found at index  "+indexBinary + " By Binary Search");

        System.out.println("The time taken by Linear search : "+ (double)linearTime/1000000.0 + "ms");
        System.out.println("The time taken by Binary search : "+ (double)binaryTime/1000000.0 + "ms");

    }
}
