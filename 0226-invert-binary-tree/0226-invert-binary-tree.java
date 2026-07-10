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
    public void reverse(TreeNode root, TreeNode ans){
        if(root==null)return;
        if(root.right!=null){
            ans.left=new TreeNode(root.right.val);
            reverse(root.right, ans.left);
        }
        if(root.left!=null){
            ans.right=new TreeNode(root.left.val);
            reverse(root.left, ans.right);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode ans=new TreeNode(root.val);
        reverse(root, ans);
        return ans;
    }
}