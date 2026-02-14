class Solution { 
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        
        while (temp != null) {
            st.push(new ListNode(temp.val));
            temp = temp.next;
        }

        Queue<ListNode> q = new LinkedList<>();
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!q.isEmpty()) {
            curr.next = q.poll();
            curr = curr.next;
        }

        return dummy.next;
    }
}
