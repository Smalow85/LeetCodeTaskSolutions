package org.example.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

class LengthOfLastWordTest {

    @ParameterizedTest
    @MethodSource("provider")
    public void testLengthOfLastWord(Map<String, Integer> args) {
        args.forEach((key, value) -> {
            int res = LengthOfLastWord.lengthOfLastWord(key);
            Assertions.assertEquals(res, value);
        });
    }

    static Stream<Map<String, Integer>> provider() {
        return Stream.of(
                Map.of("Hello World", 5),
                Map.of("   fly me   to   the moon  ", 4),
                Map.of("luffy is still joyboy", 6)
        );
    }
}