package org.example.easy;

import org.example.easy.utils.ListNode;

public class SortedListDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode tempHead = head;
        boolean firstCase = true;
        while (next != null) {
            if (tempHead.val == next.val) {
                next = next.next;
                tempHead.next = next;
                if (firstCase == true) {
                    head.next = next;
                }
                firstCase = false;
            } else {
                tempHead = next;
                if (firstCase == true) {
                    head.next = next;
                }
                firstCase = false;
                next = next.next;
            }
        }
        return head;
    }

}
