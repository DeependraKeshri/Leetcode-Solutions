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
    Queue<TreeNode> q=new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        root=q.remove();
        TreeNode temp=root;
        while(!q.isEmpty()){
            temp.left=null;
            temp.right=q.remove();
            temp=temp.right;
        }
        temp.left=null;
        temp.right=null;
        return root;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        q.add(root);
        helper(root.right);
    }
}