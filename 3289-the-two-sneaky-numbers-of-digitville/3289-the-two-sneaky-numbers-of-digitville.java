class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int j=0;
        int n=nums.length;
        boolean dummy[]=new boolean[n-2];
        for(int i=0; i<n; i++){
            if(dummy[nums[i]])arr[j++]=nums[i];
            dummy[nums[i]]=true;
        }
        return arr;
    }
}