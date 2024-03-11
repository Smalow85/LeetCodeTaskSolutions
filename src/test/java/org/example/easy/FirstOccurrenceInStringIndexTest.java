package org.example.easy;

import org.example.easy.FirstOccurrenceInStringIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceInStringIndexTest {

    @Test
    void strStr() {
        String original = "mississippi";
        String forSearch = "issip";

        int res = FirstOccurrenceInStringIndex.strStr(original, forSearch);

        assertEquals(4, res);
    }
}