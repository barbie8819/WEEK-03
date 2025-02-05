package stringbuilder.RemoveDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateElementTest {

    @Test
    void removeDuplicates() {
        assertEquals("progamin", RemoveDuplicateElement.removeDuplicates("programming"));
        assertEquals("abcd", RemoveDuplicateElement.removeDuplicates("aabbccdd"));
        assertEquals("abc", RemoveDuplicateElement.removeDuplicates("abcabcabc"));
        assertEquals("",RemoveDuplicateElement.removeDuplicates(""));
        assertEquals("a", RemoveDuplicateElement.removeDuplicates("aaaaaaa"));
        assertEquals("abcdef", RemoveDuplicateElement.removeDuplicates("abcdef"));
    }
}