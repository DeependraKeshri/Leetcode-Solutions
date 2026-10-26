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
    int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        help(root);
        return minDiff;
    }
    public void help(TreeNode root){
        if(root==null)return;
        helper(root.left, root.val);
        helper(root.right, root.val);
        help(root.left);
        help(root.right);
    }
    public void helper(TreeNode root, int curr){
        if(root==null)return;
        int diff=Math.abs(curr-root.val);
        if(diff<minDiff)minDiff=diff;
        helper(root.left, curr);
        helper(root.right, curr);
    }
}