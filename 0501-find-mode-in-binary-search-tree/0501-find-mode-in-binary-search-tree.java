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
    HashMap<Integer, Integer> mp=new HashMap<>();
    int freq=Integer.MIN_VALUE;
    public int[] findMode(TreeNode root) {
        helper(root);
        List<Integer> list=new ArrayList<>();
        for(int ele:mp.keySet()){
            if(mp.get(ele)==freq)list.add(ele);
        }
        int ans[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        int value=root.val;
        mp.put(value, mp.getOrDefault(value,1)+1);
        if(mp.get(value)>freq){
            freq=mp.get(value);
        }
        helper(root.left);
        helper(root.right);
    }
}