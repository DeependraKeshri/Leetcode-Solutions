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
    public ListNode oddEvenList(ListNode head) {
        ListNode even=new ListNode(0);
        ListNode odd=new ListNode(0);
        ListNode temp=head;
        ListNode e=even;
        ListNode o=odd;
        while(temp!=null){
            o.next=temp;
            temp=temp.next;
            o=o.next;
            e.next=temp;
            if(temp==null)break;
            temp=temp.next;
            e=e.next;
        }
        o.next=even.next;
        return odd.next;
    }
}