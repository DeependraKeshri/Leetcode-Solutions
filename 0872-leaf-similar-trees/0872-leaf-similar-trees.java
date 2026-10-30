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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        helper(root1, q1);
        helper(root2, q2);
        if(q1.size()!=q2.size())return false;
        while(!q1.isEmpty()){
            TreeNode currq1=q1.remove(), currq2=q2.remove();
            if(currq1.val!=currq2.val)return false;
        }
        return true;
    }
    public void helper(TreeNode root, Queue<TreeNode> q){
        if(root==null)return;
        if(root.left==null && root.right==null){
            q.add(root);
            return;
        }
        helper(root.left, q);
        helper(root.right, q);
    }
}