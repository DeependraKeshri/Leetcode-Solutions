class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums2.length];
        for(int i=0; i<nums2.length; i++){
            arr[i]=-1;
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[i]<nums2[j]){
                    arr[i]=nums2[j];
                    break;
                }
            }
        }
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=arr[j];
                    break;
                }
            }
        }
        return nums1;
    }
}