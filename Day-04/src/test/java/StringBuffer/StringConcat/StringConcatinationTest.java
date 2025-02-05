package StringBuffer.StringConcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatinationTest {

    @Test
    void concatenateStrings() {
        assertEquals("Hello World!", StringConcatination.concatenateStrings(new String[]{"Hello", " ", "World", "!"}));
        assertEquals("JavaProgramming", StringConcatination.concatenateStrings(new String[]{"Java", "Programming"}));
        assertEquals("", StringConcatination.concatenateStrings(new String[]{}));
        assertEquals("Single", StringConcatination.concatenateStrings(new String[]{"Single"}));
        assertEquals("1234567890", StringConcatination.concatenateStrings(new String[]{"123", "456", "7890"}));

    }
}