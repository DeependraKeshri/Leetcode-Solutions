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
    public void reorderList(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow.next);
        slow.next=null;
        ListNode first=head, fnext=head, snext=second;
        while(snext!=null){
            fnext=first.next;
            first.next=second;
            snext=second.next;
            second.next=fnext;
            first=fnext;
            second=snext;
        }
    }
    public ListNode reverse(ListNode temp){
        ListNode curr=temp, prev=null, next=curr;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}