class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int size=Math.max(nums1[nums1.length-1][0],nums2[nums2.length-1][0]);
        for(int i=0; i<nums1.length; i++){
            mp.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0; i<nums2.length; i++){
            if(!mp.containsKey(nums2[i][0])){
                mp.put(nums2[i][0],nums2[i][1]);
            }else{
                mp.put(nums2[i][0], mp.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int ans[][]=new int[mp.size()][2];
        int i=0;
        for(int j=1; j<=size; j++){
            if(mp.containsKey(j)){
                ans[i][0]=j;
                ans[i++][1]=mp.get(j);
            }
        }
        return ans;
    }
}