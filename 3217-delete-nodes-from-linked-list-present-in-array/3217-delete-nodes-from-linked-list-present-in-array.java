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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode t=head;
        while(t!=null){
             if(!set.contains(t.val)){
                temp.next=t;
                temp=temp.next;
             }else{
                temp.next=null;
             }
             t=t.next;
        }
        return dummy.next;
    }
}