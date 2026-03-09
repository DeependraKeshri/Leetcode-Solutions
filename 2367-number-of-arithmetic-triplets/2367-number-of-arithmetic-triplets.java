class Solution {
    public boolean check(int nums[],int num){
        int s=0, e=nums.length-1;
        while(s<=e){
            int mid=(e+s)/2;
            if(nums[mid]==num)return true;
            else if(nums[mid]<num)s=mid+1;
            else e=mid-1;
        }
        return false;
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        for(int i=0; i<nums.length-2; i++){
            if(check(nums,nums[i]+diff)){
                if(check(nums, nums[i]+diff+diff))count++;
            }
        }
        return count;
    }
}