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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode temp1=temp;
        while(temp1!=null && b!=-1){
            if(a!=1){
                a--;
                temp=temp.next;
            }
            temp1=temp1.next;
            b--;
        }
        temp.next=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp1;
        return list1;
    }
}