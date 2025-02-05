package InputStreamReader.ByteToCharacterStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ByteToCharacter {
    public static void main(String[] args) {
        String filePath = "C:/Users/scc/Desktop/readme.txt";
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8")) {
                int i;
                while ((i = isr.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


