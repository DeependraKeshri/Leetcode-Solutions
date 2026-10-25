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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        help(root, targetSum);
        return count;
    }
    public void help(TreeNode root, long sum){
        if(root==null)return;
        helper(root, sum);
        help(root.left, sum);
        help(root.right, sum);
    }
    public void helper(TreeNode root, long sum){
        if(root==null)return;
        sum-=root.val;
        if(sum==0)count++;
        helper(root.left, sum);
        helper(root.right, sum);
    }
}