class Solution {
    public int[] rearrangeArray(int[] nums) {
        int helper[]=new int[nums.length];
        int i=0, j=1;
        for(int k=0; k<nums.length; k++){
            if(nums[k]<0){
                helper[j]=nums[k];
                j+=2;
            }else{
                helper[i]=nums[k];
                i+=2;
            }
        }
        return helper;
    }
}