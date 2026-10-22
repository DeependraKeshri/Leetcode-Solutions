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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key){
            if(root.left==null && root.right==null)return null;
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            else{
                TreeNode curr=helper(root.right);
                root.val=curr.val;
                root.right=deleteNode(root.right, curr.val);
            }
        }else if(root.val>key){
            root.left=deleteNode(root.left, key);
        }else{
            root.right=deleteNode(root.right, key);
        }
        return root;
    }
    public TreeNode helper(TreeNode root){
        while(root.left!=null)root=root.left;
        return root;
    }
}