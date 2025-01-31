package SortingAlgorithms.MergeSort;

import java.util.Scanner;

public class BookPrices {
    public static void Merge(int[] arr,int left,int right,int mid){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(arr,left,leftArray,0,n1);
        System.arraycopy(arr,mid+1,rightArray,0,n2);
        int i=0,j=0,k=left;
        while (i<n1 && j<n2){
            if(leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;

            }
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }


    }
    public static void Mergesort(int[] arr,int left,int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Mergesort(arr, left, mid);
            Mergesort(arr, mid +1, right);
            Merge(arr, left, right, mid);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Books");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Prices of Books");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before sorting ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After sorting ");
        Mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    }

