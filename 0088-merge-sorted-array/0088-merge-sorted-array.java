class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }else{
                ans[k++]=nums2[j];
                j++;
            }
        }
        if(i==m){
            for(int l=j; l<n; l++){
                ans[k++]=nums2[l];
            }
        }else{
            for(int l=i; l<m; l++){
                ans[k++]=nums1[l];
            }
        }
        for(int a=0; a<nums1.length; a++){
            nums1[a]=ans[a];
        }
    }
}