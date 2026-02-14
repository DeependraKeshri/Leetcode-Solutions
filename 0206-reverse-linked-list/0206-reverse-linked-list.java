class Solution { 
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        Queue<Integer> q = new LinkedList<>();
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!q.isEmpty()) {
            curr.next =new ListNode(q.poll());
            curr = curr.next;
        }

        return dummy.next;
    }
}
