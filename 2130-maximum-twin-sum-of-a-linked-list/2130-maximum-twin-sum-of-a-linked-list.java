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
    public int pairSum(ListNode head) {
        ListNode s=head, f=head;
        while(f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        int sum=Integer.MIN_VALUE, val=0;
        f=head;
        s=reverse(s.next);
        while(s!=null){
            val=(s.val+f.val);
            if(val>sum)sum=val;
            s=s.next;
            f=f.next;
        }
        return sum;
    }
    public ListNode reverse(ListNode slow){
        ListNode prev=null, curr=slow, next=slow;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}