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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode t=temp.next;
        int val=0;
        while(t!=null){
            val+=t.val;
            if(t.val==0){
                t.val=val;
                temp.next=t;
                temp=t;
                val=0;
            }
            t=t.next;
        }
        return head.next;
    }
}