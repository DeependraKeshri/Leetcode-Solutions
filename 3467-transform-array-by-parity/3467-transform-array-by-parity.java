class Solution {
    public int[] transformArray(int[] nums) {
        int ceven=0;
        int codd=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0)ceven++;
            else codd++;
        }
        for(int i=0; i<nums.length; i++){
            if(ceven>0){
                nums[i]=0;
                ceven--;
            }else{
                nums[i]=1;
            }
        }
        return nums;
    }
}