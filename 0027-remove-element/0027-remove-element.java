class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val)count++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]!=val){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
            }
        }
        return nums.length-count;
    }
}