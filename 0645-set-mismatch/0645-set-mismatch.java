class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        boolean arr[]=new boolean[n];
        int num=0;
        for(int i=0; i<n; i++){
            if(i>0 && arr[nums[i]-1]){
                num=nums[i];
            }
            arr[nums[i]-1]=true;
        }
        for(int i=0; i<n; i++){
            if(!arr[i])return new int[]{num, i+1};
        }
        return new int[2];
    }
}