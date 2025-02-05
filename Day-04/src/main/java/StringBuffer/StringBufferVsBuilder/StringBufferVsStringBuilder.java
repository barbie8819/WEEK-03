package StringBuffer.StringBufferVsBuilder;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        final int ITERATIONS = 1_000_000;
        String text = "hello";

        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

    }
}
