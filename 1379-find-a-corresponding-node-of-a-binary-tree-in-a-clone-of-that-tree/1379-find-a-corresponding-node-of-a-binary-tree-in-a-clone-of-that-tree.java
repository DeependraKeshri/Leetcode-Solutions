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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(cloned);
        while(!q.isEmpty()){
            TreeNode t=q.remove();
            if(t.val==target.val)return t;
            if(t.left!=null)q.add(t.left);
            if(t.right!=null)q.add(t.right);
        }
        return null;
    }
}