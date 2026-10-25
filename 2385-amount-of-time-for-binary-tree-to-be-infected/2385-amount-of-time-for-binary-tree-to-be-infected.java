class Solution {
    int a = 0, b = 0;
    public int amountOfTime(TreeNode root, int start) {
        if (root == null) return 0;
        int[] ans = new int[1];
        solve(root, start, ans);
        return ans[0];
    }
    public int solve(TreeNode root, int start, int[] ans) {
        if (root == null) return -1;
        if (root.val == start) {
            ans[0] = height(root) - 1;
            return 0;
        }
        int left = solve(root.left, start, ans);
        int right = solve(root.right, start, ans);
        if (left != -1) {
            ans[0] = Math.max(ans[0], left + 1 + height(root.right));
            return left + 1;
        }
        if (right != -1) {
            ans[0] = Math.max(ans[0], right + 1 + height(root.left));
            return right + 1;
        }
        return -1;
    }
    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public boolean search(TreeNode root, int start) {
        if (root == null) return false;
        if (root.val == start) return true;
        return search(root.left, start) || search(root.right, start);
    }
    public void rootToStart(TreeNode root, int s, int c) {
        if (root == null) return;
        if (root.val == s) {
            a = c;
            b = height(root);
            return;
        }
        rootToStart(root.left, s, c + 1);
        rootToStart(root.right, s, c + 1);
    }
}