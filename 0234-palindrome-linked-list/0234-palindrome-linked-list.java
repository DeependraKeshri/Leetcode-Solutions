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
        ListNode prev=null;
        ListNode next=h;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        //if(fast==null || fast.next==null)return true;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow.next);
        ListNode temp=head;
        while(rev!=null){
            if(rev.val!=temp.val)return false;
            rev=rev.next;
            temp=temp.next;
        }
        return true;
    }
}