class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        helper(nums, 0, list);
        return list;
    }
    public void helper(int nums[], int idx, List<List<Integer>> list){
        if(idx==nums.length-1){
            List<Integer> l=new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                l.add(nums[i]);
            }
            list.add(l);
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(i, idx, nums);
            helper(nums, idx+1, list);
            swap(i, idx, nums);
        }
    }
    public void swap(int i, int idx, int nums[]){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}