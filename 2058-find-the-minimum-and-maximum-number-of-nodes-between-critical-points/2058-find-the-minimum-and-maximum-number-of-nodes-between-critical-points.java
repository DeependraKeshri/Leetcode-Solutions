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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null)return new int[]{-1,-1};
        ListNode t1=head;
        ListNode t2=t1.next;
        ListNode t3=t2.next;
        int ft=0, lt=0, i=2;
        int min=Integer.MAX_VALUE;
        while(t3!=null){
            if(t1.val<t2.val && t2.val>t3.val){
                if(ft==0){
                    ft=i;
                }
                if(lt!=0 && min>i-lt)min=i-lt;
                lt=i;
            }
            if(t1.val>t2.val && t2.val<t3.val){
                if(ft==0){
                    ft=i;
                }
                if(lt!=0 && min>i-lt)min=i-lt;
                lt=i;
            }
            i++;
            t1=t1.next;
            t2=t2.next;
            t3=t3.next;
        }
        if(ft==lt)return new int[]{-1,-1};
        return new int[]{min,lt-ft};
    }
}