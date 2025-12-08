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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s=0;
        ListNode t=head;
        while(t!=null){
            t=t.next;
            s++;
        }
        s-=n;
        if(s==0)return head.next;
        ListNode temp=head;
        while(s!=1){
            temp=temp.next;
            s--;
        }
        temp.next=temp.next.next;
        return head;
    }
}