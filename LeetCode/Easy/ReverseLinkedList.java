// Given the head of a singly linked list, reverse the list, and return the reversed list.

package LeetCode.Easy;

// LeetCode's definition for singly-linked list.
import LeetCode.lcdefinitions.ListNode;

// Code won't work locally as it follows LC's implementation of a LinkedList.
public class ReverseLinkedList { // 206
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
