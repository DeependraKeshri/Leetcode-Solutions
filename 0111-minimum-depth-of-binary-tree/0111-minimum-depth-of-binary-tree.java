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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        int lt=Integer.MAX_VALUE, rt=Integer.MAX_VALUE;
        if(root.left!=null)lt=minDepth(root.left);
        if(root.right!=null)rt=minDepth(root.right);
        return Math.min(lt,rt)+1;
    }
}