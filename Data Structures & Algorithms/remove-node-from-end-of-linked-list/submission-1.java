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
        private int count;
    public ListNode removeNthFromEnd(ListNode head, int n) {
         count =0;
return rec(head,n);
    }
    private ListNode rec(ListNode head,int n){
        if(head ==null){
            return null;
        }
        head.next=rec(head.next,n);
        count++;
        if(n==count){
            return head.next;
        }
        return head;
    }
}
