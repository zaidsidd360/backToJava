// Given head which is a reference node to a singly-linked list. 
// The value of each node in the linked list is either 0 or 1. 
// The linked list holds the binary representation of a number.
// Return the decimal value of the number in the linked list.
// The most significant bit is at the head of the linked list.

package LeetCode.Easy;

// LeetCode's definition for singly-linked list.
import LeetCode.lcdefinitions.ListNode;

// Code won't work locally as it follows LC's implementation of a LinkedList.
public class BinaryToIntLL { // 1290
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        String num = "";
        while (curr != null) {
            num += Integer.toString(curr.val);
            curr = curr.next;
        }
        return Integer.parseInt(num, 2);
    }
}
