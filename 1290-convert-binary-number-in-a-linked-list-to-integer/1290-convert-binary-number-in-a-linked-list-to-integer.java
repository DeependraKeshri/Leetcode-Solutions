class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while(temp != null){
            sb.append((char)(temp.val + '0'));
            temp = temp.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}