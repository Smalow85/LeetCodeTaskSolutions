package org.example.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @ParameterizedTest
    @MethodSource("hashMapProvider")
    public void testSearchInsertPosition(Map<Integer, Integer> arguments) {
        int[] nums = {1,3,5,6};
        arguments.entrySet().forEach(e -> {
            int res = SearchInsertPosition.searchInsert(nums, e.getKey());
            assertEquals(e.getValue(), res);
        });
    }

    static Stream<Map<Integer, Integer>> hashMapProvider() {
        return Stream.of(
                Map.of(0, 0),
                Map.of(1, 0),
                Map.of(2, 1),
                Map.of(8, 4)
        );
    }
}