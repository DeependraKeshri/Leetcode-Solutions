class Solution {
    public int triangularSum(int[] nums) {
        //ArrayList<Integer> list=new ArrayList<>();
        //ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-i-1; j++){
                int rem=(nums[j]+nums[j+1])%10;
                nums[j]=rem;
            }
        }
        return nums[0];
    }
}