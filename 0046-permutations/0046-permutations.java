class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        helper(nums, 0, list);
        return list;
    }
    public void swap(int nums[], int i, int idx){
        if(i==idx)return;
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
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
            swap(nums, i, idx);
            helper(nums, idx+1, list);
            swap(nums,i, idx);
        }
    }
}