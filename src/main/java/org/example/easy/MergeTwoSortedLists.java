package org.example.easy;

import org.example.easy.utils.ListNode;

import java.util.List;

public class MergeTwoSortedLists {

    public static ListNode merge(ListNode first, ListNode second) {
        if (first != null && second != null) {
            if (first.val < second.val) {
                first.next = merge(first.next, second);
                return first;
            } else {
                second.next = merge(first, second.next);
                return second;
            }
        }

        return first != null ? first : second;
    }
}
