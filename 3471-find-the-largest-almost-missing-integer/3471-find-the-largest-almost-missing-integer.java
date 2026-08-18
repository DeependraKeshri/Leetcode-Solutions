class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length-k+1; i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i; j<i+k; j++){
                set.add(nums[j]);
            }
            for(int val:set){
                mp.put(val, mp.getOrDefault(val,0)+1);
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int key:mp.keySet()){
            if(mp.get(key)==1 && key>ans)ans=key;
        }
        if(ans==Integer.MIN_VALUE)return -1;
        return ans;
    }
}