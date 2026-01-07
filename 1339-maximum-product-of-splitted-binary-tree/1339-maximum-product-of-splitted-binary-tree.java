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
    long maxi=0;
    public int sum(TreeNode root){
        if(root==null)return 0;
        root.val=sum(root.left)+sum(root.right)+root.val;
        return root.val;
    }
    public int maxProduct(TreeNode root) {
        int totSum=sum(root);
        maxPd(root, totSum);
        return (int)(maxi%1000000007);
    }
    public void maxPd(TreeNode root, int totSum){
        if(root==null)return;
        long prod=(long)(totSum-root.val)*root.val;
        if(prod>maxi)maxi=prod;
        maxPd(root.left, totSum);
        maxPd(root.right, totSum);
    }
}