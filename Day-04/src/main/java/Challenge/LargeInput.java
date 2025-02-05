package Challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class LargeInput {

    public static void main(String[] args) {
        String filePath = "C:/Users/scc/Desktop/readme.txt";

        long startTime = System.currentTimeMillis();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endTime = System.currentTimeMillis();
        System.out.println("Word Count using FileReader: " + wordCountFileReader);
        System.out.println("Time taken using FileReader: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        endTime = System.currentTimeMillis();
        System.out.println("Word Count using InputStreamReader: " + wordCountInputStreamReader);
        System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + " ms");
    }

    private static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split(" ").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    private static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split(" ").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
