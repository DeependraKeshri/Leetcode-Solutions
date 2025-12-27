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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return ans;
        list.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            ans.add(new ArrayList<>(list)); 
        }
        pathSum(root.left, targetSum - root.val);
        pathSum(root.right, targetSum - root.val);
        list.remove(list.size() - 1);
        return ans;
    }
}
