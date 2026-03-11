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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int result[][]=new int[m][n];
        ListNode temp=head;
        int tr=0, lc=0, rc=n-1, br=m-1;
        for(int i=0; i<m; i++){
            Arrays.fill(result[i],-1);
        }
        while(temp!=null){
            for(int i=lc; i<=rc && temp!=null; i++){
                result[tr][i]=temp.val;
                temp=temp.next;
            }
            tr++;
            for(int i=tr; i<=br && temp!=null; i++){
                result[i][rc]=temp.val;
                temp=temp.next;
            }
            rc--;
            for(int i=rc; i>=lc && temp!=null; i--){
                result[br][i]=temp.val;
                temp=temp.next;
            }
            br--;
            for(int i=br; i>=tr && temp!=null; i--){
                result[i][lc]=temp.val;
                temp=temp.next;
            }
            lc++;
        }
        return result;
    }
}