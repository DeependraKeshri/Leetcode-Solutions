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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null)return new int[]{-1,-1};
        ListNode t1=head;
        ListNode t2=t1.next;
        ListNode t3=t2.next;
        ArrayList<Integer> list=new ArrayList<>();
        int i=2;
        while(t3!=null){
            if(t1.val<t2.val && t2.val>t3.val){
                list.add(i);
            }
            if(t1.val>t2.val && t2.val<t3.val){
                list.add(i);
            }
            i++;
            t1=t1.next;
            t2=t2.next;
            t3=t3.next;
        }
        if(list.size()<2)return new int[]{-1,-1};
        int max=list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;
        for(int j=1; j<list.size(); j++){
            if(min>list.get(j)-list.get(j-1))min=list.get(j)-list.get(j-1);
        }
        return new int[]{min,max};
    }
}