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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            st.push(head.val);
            head=head.next;
        }
        if(st.isEmpty())return null;
        ListNode d = new ListNode(100);
        ListNode ans=d;
        while(!st.isEmpty()){
            ListNode l=new ListNode(st.pop());
            ans.next=l;
            ans=ans.next;
        }
        return d.next;
    }
}