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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            while(!st.isEmpty() && st.peek()<temp.val){
                st.pop();
            }
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode t=new ListNode(st.pop());
        while(!st.isEmpty()){
            ListNode dummy=new ListNode(st.pop());
            dummy.next=t;
            t=dummy;
        }
        return t;
    }
}