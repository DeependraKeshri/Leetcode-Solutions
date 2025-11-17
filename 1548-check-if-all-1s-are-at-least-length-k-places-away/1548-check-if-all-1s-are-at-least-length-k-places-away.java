class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                int j=i+1;
                while(j<nums.length && nums[j]!=1){
                    j++;
                }
                if(j<nums.length && (j-i-1)<k)return false;
            }
        }
    return true;
    }
}