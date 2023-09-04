/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode prev = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            prev = prev.next;
            fast = fast.next.next;

            if(prev == fast) return true;
        }
        return false;
    }
}
