package FileReader.ReadLineByLine;
import StringBuffer.StringConcat.StringConcatination;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileLineReader {
    public static void readFileLine(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}