class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        boolean valid[]=new boolean[n];
        helper(nums, n, temp,list,valid);
        return list;
    }
    public void helper(int nums[], int n, List<Integer> l, List<List<Integer>> list,boolean valid[]){
        if(n==l.size()){
            List<Integer> lt=new ArrayList<>();
            for(int i=0; i<l.size(); i++){
                lt.add(l.get(i));
            }
            list.add(lt);
            return;
        }
        for(int i=0; i<n; i++){
            if(valid[i]==false){
                l.add(nums[i]);
                valid[i]=true;
                helper(nums, n, l, list, valid);
                valid[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
}