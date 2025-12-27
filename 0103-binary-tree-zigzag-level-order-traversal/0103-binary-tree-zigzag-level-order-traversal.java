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
    Stack<TreeNode> st=new Stack<>();
    Queue<TreeNode> q=new LinkedList<>();
    int i=0;
    public List<Integer> level(){
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty())st.push(q.remove());
        while(!st.isEmpty()){
            TreeNode t=st.pop();
            if(t!=null)list.add(t.val);
            if(i%2==0){
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
            }else{
                if(t.right!=null)q.add(t.right);
                if(t.left!=null)q.add(t.left);
            }
        }
        i++;
        return list;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        int n=height(root);
        q.add(root);
        for(int i=0; i<n; i++){
            ans.add(level());
        }
        return ans;
    }
}