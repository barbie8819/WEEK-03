package LinearSearchProblems.FirstNegativeNumber;

public class FirstNegativeInArray {
    public static int NegativeNumberFinder(int[] arr){
        int n = arr.length;
        if(n==0)
            return -1;
        for(int i=0;i<n;i++){
            if(arr[i]<0)
                return i;
        }
        return -1;
    }
}
