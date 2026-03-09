class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0, e=nums.length-1;
        int max=0;
        while(s<e){
            if(max<nums[s]+nums[e])max=nums[s]+nums[e];
            s++;
            e--;
        }
        return max;
    }
}