/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            if(t.left!=null)q.add(t.left);
            if(t.right!=null)q.add(t.right);
            if(t.val%2==0){
                if(t.left!=null){
                    if(t.left.left!=null)sum+=t.left.left.val;
                    if(t.left.right!=null)sum+=t.left.right.val;
                }
                if(t.right!=null){
                    if(t.right.left!=null)sum+=t.right.left.val;
                    if(t.right.right!=null)sum+=t.right.right.val;
                }
            }
        }
        return sum;
    }
}