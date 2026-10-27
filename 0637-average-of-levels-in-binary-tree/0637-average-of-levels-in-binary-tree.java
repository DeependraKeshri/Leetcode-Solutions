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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            double sum=0, size=q.size()-1;
            TreeNode curr=q.remove();
            while(curr!=null){
                sum+=curr.val;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                curr=q.remove();
            }
            if(curr==null){
                list.add(sum/size);
                if(!q.isEmpty())q.add(null);
                else break;
            }
        }
        return list;
    }
}