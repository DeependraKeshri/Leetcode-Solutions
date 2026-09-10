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
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        if(root.val==(nodeSum(root)/countNode(root)))count++;
        helper(root.left);
        helper(root.right);
    }
    public int countNode(TreeNode root){
        if(root==null)return 0;
        return countNode(root.left)+countNode(root.right)+1;
    }
    public int nodeSum(TreeNode root){
        if(root==null)return 0;
        return nodeSum(root.left) + nodeSum(root.right) + root.val;
    }
}