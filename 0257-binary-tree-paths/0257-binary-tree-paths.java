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
    public List<String> helper(TreeNode root, List<String> l, String str){
        if(root==null)return l;
        if(root.left==null && root.right==null){
            str+=root.val;
            l.add(str);
            return l;
        }
        helper(root.left, l, str+root.val+"->");
        helper(root.right, l, str+root.val+"->");
        return l;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        String s="";
        return helper(root, list, s);
    }
}