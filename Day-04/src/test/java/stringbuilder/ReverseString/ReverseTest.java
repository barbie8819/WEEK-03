package stringbuilder.ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {


    @Test
    void reverseString() {

        String expected = "ihsna";
        String actual = Reverse.reverseString("anshi");
        assertEquals(expected,actual);
    }
}