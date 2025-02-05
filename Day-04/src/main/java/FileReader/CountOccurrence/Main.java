package FileReader.CountOccurrence;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/scc/Desktop/readme.txt";
      int count=  CountWordOccurrence.WordCount("Anshi",filePath);
        System.out.println("Word Anshi Occurred : "+ count);
    }
}
