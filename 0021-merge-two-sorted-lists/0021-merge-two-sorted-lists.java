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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1, t2=list2, t=new ListNode(100), d=t;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                d.next=t1;
                t1=t1.next;
            }else{
                d.next=t2;
                t2=t2.next;
            }
            d=d.next;
        }
        if(t1!=null)d.next=t1;
        if(t2!=null)d.next=t2;
        return t.next;
    }
}