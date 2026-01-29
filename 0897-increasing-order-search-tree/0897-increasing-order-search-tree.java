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
    public void helper(TreeNode root, ArrayList<Integer> list){
        if(root==null)return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root, list);
        TreeNode r=new TreeNode(list.get(0));
        TreeNode temp=r;
        int i=1;
        while(i<list.size()){
            TreeNode n=new TreeNode(list.get(i));
            temp.right=n;
            temp=temp.right;
            i++;
        }
        return r;
    }
}