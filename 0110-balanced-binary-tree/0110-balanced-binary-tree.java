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
        return Math.max(height(root.left), height(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lt=height(root.left);
        int rt=height(root.right);
        if(Math.abs(lt-rt)>1)return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }
}