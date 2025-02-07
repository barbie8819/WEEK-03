package FileReaderVsInputStreamReader;

import java.io.*;

public class ReaderComparision {
    public static long FileReaderTime(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        long startTime = System.nanoTime();
        while (reader.read()!=-1);
        return (System.nanoTime()-startTime)/1000000;

    }
    public static long InputStreamTime(String filePath) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        long startTime = System.nanoTime();
        while (reader.read()!=-1);
        return (System.nanoTime()-startTime)/1000000;

    }
}
