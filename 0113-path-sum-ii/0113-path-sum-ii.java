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
    public void helper(TreeNode root, List<List<Integer>> l,List<Integer> lt, int targetSum){
        if(root==null)return;
        lt.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum-root.val==0){
                l.add(new ArrayList(lt));
            }
            lt.remove(lt.size()-1);
            return;
        }
        helper(root.left, l, lt, targetSum-root.val);
        helper(root.right, l, lt, targetSum-root.val);
        lt.remove(lt.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        helper(root, list, li, targetSum);
        return list;
    }
}