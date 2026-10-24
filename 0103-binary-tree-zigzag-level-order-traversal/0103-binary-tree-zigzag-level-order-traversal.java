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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return list;
        q.add(root);
        q.add(null);
        int i=0;
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            TreeNode curr=q.remove();
            while(curr!=null){
                if(i%2==0){
                    l.add(curr.val);
                }
                if(i%2==1){
                    l.add(0,curr.val);
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                curr=q.remove();
            }
            list.add(l);
            if(curr==null && !q.isEmpty()){
                i++;
                q.add(null);
            }else{
                break;
            }
        }
        return list;
    }
}