package StringContatinationComparision;

public class TimeComparision {


    public static long testStringConcatenation(int N) {
        String str = "";
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testStringBuilderConcatenation(int N) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testStringBufferConcatenation(int N) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

}
