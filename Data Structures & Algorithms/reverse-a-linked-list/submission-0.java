/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev, nex, curr = new ListNode();
        prev = null;
        curr = head;
        nex  = head.next;
        while(nex != null){
            curr.next = prev;
            prev = curr;
            curr = nex;
            nex = curr.next;
        }
        curr.next = prev;
        return curr;
    }
}
