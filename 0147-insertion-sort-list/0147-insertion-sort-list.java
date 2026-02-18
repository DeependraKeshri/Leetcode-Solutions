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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val > temp.next.val) {
                ListNode t = temp.next;     
                temp.next = t.next;        
                if (t.val < head.val) {
                    t.next = head;
                    head = t;
                } 
                else {
                    ListNode dummy = head;
                    while (dummy.next != null && dummy.next.val < t.val) {
                        dummy = dummy.next;
                    }
                    t.next = dummy.next;
                    dummy.next = t;
                }
            } 
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}
