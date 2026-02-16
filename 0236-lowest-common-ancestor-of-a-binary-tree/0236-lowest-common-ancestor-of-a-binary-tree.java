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
    public boolean contains(TreeNode root, TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
        return contains(root.left, node) || contains(root.right, node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root)return root;
        if(p==q)return q;
        boolean lt=contains(root.left, p);
        boolean rt=contains(root.right, q);
        if((lt && rt) || (!lt && !rt))return root;
        if(lt && !rt)return lowestCommonAncestor(root.left, p, q);
        if(!lt && rt)return lowestCommonAncestor(root.right, p, q);
        return null;
    }
}