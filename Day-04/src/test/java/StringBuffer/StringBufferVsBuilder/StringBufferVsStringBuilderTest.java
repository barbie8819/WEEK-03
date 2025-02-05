package StringBuffer.StringBufferVsBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBufferVsStringBuilderTest {
    @Test
    void testPerformanceComparison() {
        final int ITERATIONS = 10_000; // Reduced for testing
        String text = "test";

        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(text);
        }
        long durationBuffer = System.nanoTime() - startTimeBuffer;

        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(text);
        }
        long durationBuilder = System.nanoTime() - startTimeBuilder;

        assertTrue(durationBuilder <= durationBuffer);
    }

}