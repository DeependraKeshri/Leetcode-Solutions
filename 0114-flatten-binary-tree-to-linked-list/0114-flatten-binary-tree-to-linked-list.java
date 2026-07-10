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
    List<Integer> list=new ArrayList<>();
    public void helper(TreeNode root){
        if(root==null)return;
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null)return;
        helper(root);
        root.val=list.get(0);
        for(int i=1; i<list.size(); i++){
            root.right=new TreeNode(list.get(i));
            root.left=null;
            root=root.right;
        }
    }
}