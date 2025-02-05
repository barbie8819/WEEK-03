package LinearSearchProblems.SearchSpecificWord;

public class SpecificWordFinder {
    public static String searchForWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
