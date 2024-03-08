package org.example.easy;

import org.example.easy.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    public void testMerge() {
        ListNode first = new ListNode(1, new ListNode(3, new ListNode(5, null)));
        ListNode second = new ListNode(2, new ListNode(3, null));

        int[] expected = new int [] {1,2,3,3,5};
        ListNode res = MergeTwoSortedLists.merge(first, second);
        List<Integer> temp = new ArrayList<>();
        while (res != null) {
            temp.add(res.val);
            res = res.next;
        }
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], temp.get(i).intValue());
        }
    }
}