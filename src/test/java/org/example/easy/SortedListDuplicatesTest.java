package org.example.easy;

import org.example.easy.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortedListDuplicatesTest {
    @Test
    public void testSortedListDuplicates() {
        ListNode original = new ListNode(1, new ListNode(1, new ListNode(5, new ListNode(5, null))));
        ListNode res = SortedListDuplicates.deleteDuplicates(original);
        assertEquals(5, res.next.val);
    }

    @Test
    public void testSortedListDuplicates_2() {
        ListNode original = new ListNode(1, new ListNode(2, null));
        ListNode res = SortedListDuplicates.deleteDuplicates(original);
        assertEquals(2, res.next.val);
    }

}