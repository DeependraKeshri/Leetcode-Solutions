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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int rem=size%k;
        int s=size/k;
        temp=head;
        if(s==0){
            for(int i=0; i<k; i++){
                if(temp!=null){
                    ans[i]=new ListNode(temp.val);
                    temp=temp.next;
                }else ans[i]=null;
            }
        }else{
            for(int i=0; i<k; i++){
                int idx=s;
                if(rem>0){
                    idx+=1;
                    rem--;
                }
                ListNode t=new ListNode(0);
                ListNode dummy=t;
                while(idx>0){
                    dummy.next=new ListNode(temp.val);
                    dummy=dummy.next;
                    temp=temp.next;
                    idx--;
                }
                ans[i]=t.next;
            }
        }
        return ans;
    }
}