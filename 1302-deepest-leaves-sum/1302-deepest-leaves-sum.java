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
    public int height(TreeNode root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public int level(TreeNode root, int n){
        if(root==null)return 0;
        if(n==1)return root.val;
        return level(root.left,n-1)+level(root.right,n-1);
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        return level(root,h);
    }
}