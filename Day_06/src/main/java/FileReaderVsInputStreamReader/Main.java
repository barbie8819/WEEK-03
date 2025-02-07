package FileReaderVsInputStreamReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("The comparision on the file : ");
            String filePath ="C:/Users/scc/Downloads/500MB-CZIPtestfile.org.zip";
            long fileReaderTime = ReaderComparision.FileReaderTime(filePath);
            System.out.println("The time taken to read File by FileReader : " + fileReaderTime + " ms");
            long InputStreamReaderTime = ReaderComparision.InputStreamTime(filePath);
            System.out.println("The time taken to read File by FileReader : " +InputStreamReaderTime+ " ms");

        }catch (IOException e){
            System.out.println("The file is not found");
        }
    }
}
