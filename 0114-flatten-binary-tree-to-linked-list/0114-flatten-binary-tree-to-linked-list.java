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
    public void flatten(TreeNode root) {
        if(root==null)return;
        TreeNode lt=root.left;
        TreeNode rt=root.right;
        flatten(lt);
        flatten(rt);
        if(lt!=null){
            root.left=null;
            root.right=lt;
            TreeNode curr=root;
            while(curr.right!=null){
                curr=curr.right;
            }
            curr.right=rt;
        }
    }
}