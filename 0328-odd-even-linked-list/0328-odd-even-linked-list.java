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
        ListNode odd=new ListNode(1), o=odd, even=new ListNode(0), e=even, temp=head;
        while(temp!=null){
            o.next=temp;
            temp=temp.next;
            o=o.next;
            e.next=temp;
            if(temp==null)break;
            temp=temp.next;
            e=e.next;
        }
        odd=odd.next;
        even=even.next;
        o.next=even;
        return odd;
    }
}