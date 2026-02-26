class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int j=0, k=n;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i]=nums[j++];
            }else{
                arr[i]=nums[k++];
            }
        }
        return arr;
    }
}