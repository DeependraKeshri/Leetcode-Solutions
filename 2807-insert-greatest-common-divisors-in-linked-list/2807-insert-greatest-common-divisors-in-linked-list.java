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
    public int gcd(int a, int b){
        while(a%b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        ListNode t=temp.next;
        while(t!=null){
            int val=gcd(temp.val, t.val);
            ListNode nw=new ListNode(val);
            nw.next=temp.next;
            temp.next=nw;
            temp=t;
            t=t.next;
        }
        return head;
    }
}