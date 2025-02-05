package StringBuffer.StringConcat;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};
        String output = StringConcatination.concatenateStrings(strings);
        System.out.println("Concatenated String: " + output);
    }
}
