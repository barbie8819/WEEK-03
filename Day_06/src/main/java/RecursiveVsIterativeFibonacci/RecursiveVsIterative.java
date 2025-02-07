package RecursiveVsIterativeFibonacci;

public class RecursiveVsIterative {
    public static long fibonacciRecursive(int n) {
        if (n <= 1) return (long)n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) return (long)n;
        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void measurePerformance(int n) {
        System.out.println("Fibonacci Number: " + n);
        long start = System.nanoTime();
        long resultIterative = fibonacciIterative(n);
        double iterativeTime =(double) (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        long resultRecursive = fibonacciRecursive(n);
        double recursiveTime = (double) (System.nanoTime() - start) / 1_000_000; // Convert to milliseconds

        System.out.println("Recursive Result: " + resultRecursive + ", Time: " + recursiveTime + " ms");
        System.out.println("Iterative Result: " + resultIterative + ", Time: " + iterativeTime + " ms");
        System.out.println("--------------------------------------");
    }
}
