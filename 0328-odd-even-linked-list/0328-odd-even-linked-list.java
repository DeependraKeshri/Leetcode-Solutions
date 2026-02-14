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
        int i=0;
        while(temp!=null){
            if(i%2==1){
                e.next=new ListNode(temp.val);
                e=e.next;
            }else{
                o.next=new ListNode(temp.val);
                o=o.next;
            }
            temp=temp.next;
            i++;
        }
        o.next=even.next;
        return odd.next;
    }
}