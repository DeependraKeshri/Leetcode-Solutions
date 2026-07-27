class Solution {
    public int findPeakElement(int[] nums) {
        int s=0, e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if((m==0 || nums[m]>nums[m-1]) && (m==nums.length-1 ||nums[m]>nums[m+1]))return m;
            else if(nums[m]>nums[m+1])e=m-1;
            else s=m+1;
        }
        return s;
    }
}