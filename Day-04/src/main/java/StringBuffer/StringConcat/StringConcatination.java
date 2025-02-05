package StringBuffer.StringConcat;

public class StringConcatination {
    public static String concatenateStrings(String[] strings) {
        StringBuffer result = new StringBuffer();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }
}
