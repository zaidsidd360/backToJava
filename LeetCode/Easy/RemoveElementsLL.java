// Given the head of a linked list and an integer val, remove 
// all the nodes of the linked list that has Node.val == val, 
// and return the new head.

package LeetCode.Easy;

// LeetCode's definition for singly-linked list.
import LeetCode.lcdefinitions.ListNode;

// Code won't work locally as it follows LC's implementation of a LinkedList.
class RemoveElementsLL { // 203
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head.val == val ? head.next : head;
    }
}