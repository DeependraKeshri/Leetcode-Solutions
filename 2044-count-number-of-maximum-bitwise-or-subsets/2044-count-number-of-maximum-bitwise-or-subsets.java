class Solution {
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        int or=0;
        for(int ele:nums){
            or|=ele;
        }
        helper(nums, or, 0, 0);
        return count;
    }
    public void helper(int nums[], int or, int val, int i){
        if(i==nums.length){
            if(val==or){
                count++;
            }
            return;
        }
        helper(nums, or, val|nums[i], i+1);
        helper(nums, or, val, i+1);
    }
}