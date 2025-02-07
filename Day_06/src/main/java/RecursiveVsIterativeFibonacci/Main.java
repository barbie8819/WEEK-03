package RecursiveVsIterativeFibonacci;

public class Main {
    public static void main(String[] args) {
        int[] testCases = {10, 30, 50};

        for (int n : testCases) {
                RecursiveVsIterative.measurePerformance(n);
        }
    }
}
