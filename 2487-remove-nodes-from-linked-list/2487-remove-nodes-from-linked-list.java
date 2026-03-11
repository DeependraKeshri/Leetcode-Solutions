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
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode t=new ListNode(st.pop());
        while(!st.isEmpty()){
            if(st.peek()>=t.val){
                ListNode dummy=new ListNode(st.pop());
                dummy.next=t;
                t=dummy;
            }else{
                st.pop();
            }
        }
        return t;
    }
}