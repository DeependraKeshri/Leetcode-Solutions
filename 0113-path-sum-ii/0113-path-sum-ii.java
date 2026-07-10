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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        helper(list, new ArrayList<>(), root, targetSum);
        return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> l, TreeNode root, int targetSum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            l.add(root.val);
            if(targetSum-root.val==0){
                list.add(new ArrayList<>(l));
            }
            l.remove(l.size()-1);
            return;
        }
        l.add(root.val);
        helper(list, l, root.left, targetSum-root.val);
        helper(list, l, root.right, targetSum-root.val);
        l.remove(l.size()-1);
    }
}