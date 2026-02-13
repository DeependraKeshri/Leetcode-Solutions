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
    public ListNode reverse(ListNode h){
        ListNode curr=h;
        ListNode next=h;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow.next);
        ListNode temp=head;
        while(slow!=null){
            int s=temp.val+slow.val;
            if(s>sum)sum=s;
            temp=temp.next;
            slow=slow.next;
        }
        return sum;
    }
}