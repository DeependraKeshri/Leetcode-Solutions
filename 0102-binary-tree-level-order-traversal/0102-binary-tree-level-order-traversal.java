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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            TreeNode curr=q.remove();
            while(curr!=null){
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                l.add(curr.val);
                curr=q.remove();
            }
            list.add(l);
            if(q.isEmpty())break;
            q.add(null);
        }
        return list;
    }
}