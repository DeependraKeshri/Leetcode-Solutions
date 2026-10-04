class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        int freq=0;
        for(int ele:mp.keySet()){
            if(freq<mp.get(ele))freq=mp.get(ele);
        }
        HashSet<Integer> set=new HashSet<>();
        int len=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(mp.get(nums[i])==freq && !set.contains(nums[i])){
                set.add(nums[i]);
                int j=i, count=freq;
                while(j<n && count>0){
                    if(nums[j]==nums[i])count--;
                    j++;
                }
                len=Math.min(len, j-i);
            }
        }
        return len;
    }
}