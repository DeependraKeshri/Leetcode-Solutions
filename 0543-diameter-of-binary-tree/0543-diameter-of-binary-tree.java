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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int diam1=height(root.left);
        int diam2=height(root.right);
        int diam3=Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        return Math.max(diam3, diam1+diam2);
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
}