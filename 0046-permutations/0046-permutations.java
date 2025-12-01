class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean isVisted[] =new boolean[nums.length];
        helper(nums,ans, list, isVisted);
        return ans;
    }
    public void helper(int nums[], List<List<Integer>> ans, List<Integer> list, boolean isVisted[]){
        if(list.size()==nums.length){
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                l.add(list.get(i));
            }
            ans.add(l);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(isVisted[i]==false){
                isVisted[i]=true;
                list.add(nums[i]);
                helper(nums,ans,list,isVisted);
                isVisted[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}