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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode t=temp;
        int carry=0;
        while(l1!=null && l2!=null){
            int v=l1.val+l2.val+carry;
            if(v>9){
                v%=10;
                t.next=new ListNode(v);
                carry=1;
            }else{
                t.next=new ListNode(v);
                carry=0;
            }
            t=t.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int v=l1.val+carry;
            if(v>9){
                v%=10;
                t.next=new ListNode(v);
                carry=1;
            }else{
                t.next=new ListNode(v);
                carry=0;
            }
            t=t.next;
            l1=l1.next;
        }
        while(l2!=null){
            int v=l2.val+carry;
            if(v>9){
                v%=10;
                t.next=new ListNode(v);
                carry=1;
            }else{
                t.next=new ListNode(v);
                carry=0;
            }
            t=t.next;
            l2=l2.next;
        }
        if(carry==1){
            t.next=new ListNode(1);
        }
        return temp.next;
    }
}