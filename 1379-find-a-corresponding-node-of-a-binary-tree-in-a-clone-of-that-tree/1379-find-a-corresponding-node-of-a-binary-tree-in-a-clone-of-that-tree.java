/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode temp=new TreeNode(10);
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(cloned, target.val);
        return temp;
    }
    public void helper(TreeNode root, int target){
        if(root==null)return;
        if(root.val==target){
            temp=root;
            return;
        }
        helper(root.left, target);
        helper(root.right, target);
    }
}