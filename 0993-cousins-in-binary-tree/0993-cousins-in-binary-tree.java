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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            boolean xt=false, yt=false;
            while(curr!=null){
                if(curr.left!=null){
                    q.add(curr.left);
                    if(curr.left.val==x)xt=true;
                    if(curr.left.val==y)yt=true;
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    if(curr.right.val==x)xt=true;
                    if(curr.right.val==y)yt=true;
                }
                if(curr.left!=null && curr.right!=null && ((curr.left.val==x && curr.right.val==y) || (curr.right.val==x && curr.left.val==y)))return false;
                curr=q.remove();
            }
            if(xt && yt)return true;
            if(!q.isEmpty())q.add(null);
        }
        return false;
    }
}