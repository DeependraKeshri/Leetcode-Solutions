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
    public boolean isSame(TreeNode l, TreeNode r){
        if(l==null && r==null)return true;
        if(l==null || r==null)return false;
        if(l.val!=r.val)return false;
        return isSame(l.left, r.left) && isSame(l.right, r.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        root.right=invert(root.right);
        return isSame(root.left, root.right);
    }
}