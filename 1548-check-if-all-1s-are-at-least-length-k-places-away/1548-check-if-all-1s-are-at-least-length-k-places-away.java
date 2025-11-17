class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       int l=-1;
       for(int i=0; i<nums.length; i++){
        if(nums[i]==1){
            if(i-l-1<k && l!=-1)return false;
            l=i;
        }
       } 
       return true;
    }
}