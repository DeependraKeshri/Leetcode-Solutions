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
    public ListNode swapNodes(ListNode head, int k) {
        int size=1, lval=0;
        ListNode temp=head;
        while(temp!=null){
            if(size==k)lval=temp.val;
            size++;
            temp=temp.next;
        }
        size-=k;
        ListNode dummy=head;
        while(size>1){
            dummy=dummy.next;
            size--;
        }
        int rval=dummy.val;
        dummy.val=lval;
        ListNode t=head;
        while(k>1){
            t=t.next;
            k--;
        }
        t.val=rval;
        return head;
    }
}