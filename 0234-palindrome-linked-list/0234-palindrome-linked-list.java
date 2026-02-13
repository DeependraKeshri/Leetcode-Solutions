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
        if(head==null || head.next==null)return true;
        ListNode t=head;
        ListNode temp=new ListNode(10);
        ListNode tp=temp;
        while(t!=null){
            tp.next=new ListNode(t.val);
            tp=tp.next;
            t=t.next;
        }
        temp=temp.next;
        ListNode dummy=reverse(head);
        while(temp!=null){
            if(temp.val!=dummy.val)return false;
            temp=temp.next;
            dummy=dummy.next;
        }
        return true;
    }
}