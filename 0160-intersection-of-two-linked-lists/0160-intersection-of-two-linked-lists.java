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
        int sa=0;
        int sb=0;
        ListNode ta=headA;
        ListNode tb=headB;
        while(ta!=null){
            sa++;
            ta=ta.next;
        }
        while(tb!=null){
            sb++;
            tb=tb.next;
        }
        int diff=0;
        ListNode tempa=headA;
        ListNode tempb=headB;
        if(sa>sb){
            diff=sa-sb;
            while(diff>0){
                tempa=tempa.next;
                diff--;
            }
        }else if(sb>sa){
            diff=sb-sa;
            while(diff>0){
                tempb=tempb.next;
                diff--;
            }
        }
        while(tempa!=null){
            if(tempa==tempb)return tempa;
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return tempa;
    }
}