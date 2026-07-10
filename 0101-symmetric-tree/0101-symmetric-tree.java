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
    public TreeNode invert(TreeNode root){
        if(root==null)return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invert(r);
        root.right=invert(l);
        return root;
    }
    public boolean isSameTree(TreeNode root, TreeNode s){
        if(root==null && s==null)return true;
        if(root==null || s==null)return false;
        if(root.val!=s.val)return false;
        return isSameTree(root.left, s.left) && isSameTree(root.right, s.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        root.left=invert(root.left);
        return isSameTree(root.left, root.right);
    }
}