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
    public int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public int count(TreeNode root){
        if(root==null)return 0;
        return count(root.left)+count(root.right)+1;
    }
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null)return 0;
        int avg=sum(root)/count(root);
        if(root.val==avg)c++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return c;
    }
}