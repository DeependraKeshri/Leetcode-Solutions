class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0; i<nums.length; i++){
            int val=target-nums[i];
            if(mp.containsKey(val)){
                ans=new int[]{i,mp.get(val)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}