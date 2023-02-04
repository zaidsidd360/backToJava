// Given the head of a sorted linked list, delete all duplicates 
// such that each element appears only once. Return the linked list 
// sorted as well.

package LeetCode.Easy;

// LeetCode's definition for singly-linked list.
import LeetCode.lcdefinitions.ListNode;

// Code won't work locally as it follows LC's implementation of a LinkedList.
public class RemoveDuplicatesLL { // 83
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
