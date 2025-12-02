class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums, 0,ans);
        return ans;
    }
    public void helper(int nums[], int idx, List<List<Integer>> ans){
        if(idx==nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            helper(nums, idx+1, ans);
            swap(nums, i, idx);
        }
    }
    public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}