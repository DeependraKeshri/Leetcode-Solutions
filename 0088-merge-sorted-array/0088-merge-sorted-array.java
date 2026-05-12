class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        while(i>=0 && nums1[i]==0){
            i--;
        }
        i++;
        int j=0;
        while(j<nums2.length && i<nums1.length){
            nums1[i++]=nums2[j++];
        }
        Arrays.sort(nums1);
    }
}