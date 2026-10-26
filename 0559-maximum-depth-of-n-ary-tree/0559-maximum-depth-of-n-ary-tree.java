class Solution {
    int count = 0;
    public int maxDepth(Node root) {
        count = 0;
        if (root == null) return 0;
        helper(root, 1);
        return count;
    }
    public void helper(Node root, int c) {
        if (root.children == null || root.children.isEmpty()) {
            count = Math.max(count, c);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), c + 1);
        }
    }
}