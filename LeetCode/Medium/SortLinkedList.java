/*
Given the head of a linked list, return the list after sorting it in ascending order.
*/

package LeetCode.Medium;

import java.util.*;

// LeetCode's definition for singly-linked list.
import LeetCode.lcdefinitions.ListNode;

// Code won't work locally as it follows LC's implementation of a LinkedList.
public class SortLinkedList { // 148
    public static ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);
        curr = head;
        int i = 0;
        while (curr != null) {
            curr.val = list.get(i);
            i++;
            curr = curr.next;
        }
        return head;
    }
}
