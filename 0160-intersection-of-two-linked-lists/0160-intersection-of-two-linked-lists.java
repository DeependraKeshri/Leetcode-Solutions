/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta=headA, tb=headB;
        while(ta!=tb){
            ta=ta.next;
            tb=tb.next;
            if(ta==tb)return ta;
            if(ta==null)ta=headB;
            if(tb==null)tb=headA;
        }
        return ta;
    }
}