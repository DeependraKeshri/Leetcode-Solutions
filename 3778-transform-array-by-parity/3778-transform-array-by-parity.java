class Solution {
    public int[] transformArray(int[] nums) {
       int evenCount=0, oddCount=0;
       for(int i=0; i<nums.length; i++){
        if(nums[i]%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
       } 
       for(int i=0; i<nums.length; i++){
        if(evenCount>0){
            nums[i]=0;
            evenCount--;
        }else{
            nums[i]=1;
        }
       }
       return nums;
    }
}