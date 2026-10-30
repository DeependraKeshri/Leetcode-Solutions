class Solution {
    int minval = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            helper(root, curr);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return minval;
    }
    public void helper(TreeNode root, TreeNode curr) {
        if (root == null) return;
        if (root != curr) {
            minval = Math.min(minval, Math.abs(root.val - curr.val));
        }
        helper(root.left, curr);
        helper(root.right, curr);
    }
}