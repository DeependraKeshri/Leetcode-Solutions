class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>nums[idx]){
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1])idx=i;
            }
        }
        if(nums[nums.length-1]>nums[idx])idx=nums.length-1;
        return idx;
    }
}