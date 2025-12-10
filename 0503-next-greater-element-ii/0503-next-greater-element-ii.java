class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]=new int [nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=-1;
            int j=i+1;
            for( ; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    arr[i]=nums[j];
                    break;
                }
            }
            if(arr[i]==-1 && j==nums.length){
                for(int k=0; k<i; k++){
                    if(nums[i]<nums[k]){
                        arr[i]=nums[k];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}