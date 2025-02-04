package stringbuilder.ReverseString;

public class Reverse {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);


        sb.reverse();


        return sb.toString();
    }

}
