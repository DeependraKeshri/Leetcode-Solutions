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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int s=size-(k%size);
        if(s==size)return head;
        ListNode t=head;
        while(s>1){
            t=t.next;
            s--;
        }
        ListNode newHead=t.next;
        t.next=null;
        t=newHead;
        while(t.next!=null){
            t=t.next;
        }
        t.next=head;
        return newHead;
    }
}