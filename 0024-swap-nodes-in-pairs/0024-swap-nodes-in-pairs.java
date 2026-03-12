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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode even=head;
        ListNode odd=even.next;
        while(even!=null && odd!=null){
            int temp=even.val;
            even.val=odd.val;
            odd.val=temp;
            even=odd.next;
            if(even!=null)odd=even.next;
        }
        return head;
    }
}