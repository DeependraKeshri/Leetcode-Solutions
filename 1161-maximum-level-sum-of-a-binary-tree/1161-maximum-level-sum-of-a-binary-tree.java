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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)q.add(root);
        int level=1, ans=1;
        int maxSum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0; i<size; i++){
                TreeNode t=q.poll();
                sum+=t.val;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
            }
            if(maxSum<sum){
                maxSum=sum;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}