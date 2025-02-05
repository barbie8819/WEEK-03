package FileReader.CountOccurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountWordOccurrence {
    public static int WordCount(String word, String filepath) {
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(filepath));
            String Line = "";
            int count = 0;
            while ((Line = bufferReader.readLine()) != null) {
                String words[] = Line.split(" ");
                for (String s : words) {
                    if (s.equals(word)) count++;
                }

            }
            return count;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    }

